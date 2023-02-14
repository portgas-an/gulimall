package com.ace.gulimall.product.service.impl

import com.ace.gulimall.common.constant.AttrEnum
import com.ace.gulimall.common.utils.PageUtils
import com.ace.gulimall.common.utils.Query
import com.ace.gulimall.product.dao.AttrAttrgroupRelationDao
import com.ace.gulimall.product.dao.AttrDao
import com.ace.gulimall.product.dao.AttrGroupDao
import com.ace.gulimall.product.dao.CategoryDao
import com.ace.gulimall.product.entity.AttrAttrgroupRelationEntity
import com.ace.gulimall.product.entity.AttrEntity
import com.ace.gulimall.product.entity.AttrGroupEntity
import com.ace.gulimall.product.service.AttrService
import com.ace.gulimall.product.service.CategoryService
import com.ace.gulimall.product.vo.AttrRespVo
import com.ace.gulimall.product.vo.AttrVo
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import org.springframework.beans.BeanUtils
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service("attrService")
class AttrServiceImpl : ServiceImpl<AttrDao, AttrEntity>(), AttrService {

    @Autowired
    private lateinit var relationDao: AttrAttrgroupRelationDao

    @Autowired
    private lateinit var attrGroupDao: AttrGroupDao

    @Autowired
    private lateinit var categoryDao : CategoryDao

    @Autowired
    private lateinit var categoryService: CategoryService

    override fun queryPage(params: Map<String?, Any?>?): PageUtils {
        val page = this.page(
            Query<AttrEntity>().getPage(params),
            QueryWrapper()
        )
        return PageUtils(page)
    }

    @Transactional
    override fun saveAttr(attr: AttrVo) {
        val attrEntity = AttrEntity()
        BeanUtils.copyProperties(attr, attrEntity)
        //保存基本数据
        this.save(attrEntity)
        //保存关联关系
        if (attr.attrType == AttrEnum.ATTR_TYPE_BASE.code) {
            relationDao.insert(AttrAttrgroupRelationEntity().apply {
                attrGroupId = attr.attrGroupId
                attrId = attrEntity.attrId
            })
        }
    }

    override fun queryBaseAttrPage(params: Map<String?, Any?>, catelog: Long?, type: String): PageUtils {
        val page = this.page(Query<AttrEntity>().getPage(params), QueryWrapper<AttrEntity>().apply {
            eq("attr_type", if ("base" == type) AttrEnum.ATTR_TYPE_BASE.code else AttrEnum.ATTR_TYPE_SALE.code)
            if (catelog != 0L) {
                eq("catelog_id", catelog)
            }
            val key = params["key"] as String?
            if (key?.isNotEmpty() == true) {
                and { it.eq("attr_id", key).or().like("attr_name", key) }
            }
        })
        val pageUtils = PageUtils(page)
        pageUtils.list = page.records.map {
            val attrRespVo = AttrRespVo()
            BeanUtils.copyProperties(it, attrRespVo)
            if ("base" == type) {
                val attrAttrgroupRelationEntity =
                    relationDao.selectOne(QueryWrapper<AttrAttrgroupRelationEntity>().eq("attr_id", it.attrId))
                val attrGroupEntity = attrGroupDao.selectById(attrAttrgroupRelationEntity?.attrGroupId)
                attrGroupEntity?. attrGroupName?.let { name ->
                    attrRespVo.groupName = name
                }
            }
            val categoryEntity = categoryDao.selectById(it.catelogId)
            categoryEntity?.name?.let { name ->
                attrRespVo.catelogName = name
            }
            attrRespVo
        }
        return pageUtils
    }

    override fun getAttrInfo(attrId: Long?): AttrRespVo {
        val attrRespVo = AttrRespVo()
        val attrEntity = this.getById(attrId)
        BeanUtils.copyProperties(attrEntity, attrRespVo)
        //设置分组信息
        if (attrEntity.attrType == AttrEnum.ATTR_TYPE_BASE.code) {
            val attrAttrgroupRelationEntity =
                relationDao.selectOne(QueryWrapper<AttrAttrgroupRelationEntity>().eq("attr_id", attrId))
            attrAttrgroupRelationEntity?.attrGroupId?.let {
                attrRespVo.attrGroupId = it
                val attrGroupEntity = attrGroupDao.selectById(it)
                attrRespVo.groupName = attrGroupEntity?.attrGroupName
            }
        }
        //设置分类信息
        attrEntity.catelogId?.let {
            attrRespVo.catelogPath = categoryService.findCategoryPath(it)
            val categoryEntity = categoryDao.selectById(it)
            attrRespVo.catelogName = categoryEntity.name
        }

        return attrRespVo
    }

    @Transactional
    override fun updateAttr(attr: AttrVo) {
        val attrEntity = AttrEntity()
        BeanUtils.copyProperties(attr, attrEntity)
        this.updateById(attrEntity)
        //修改分组关联
        if (attr.attrType == AttrEnum.ATTR_TYPE_BASE.code) {
            val attrAttrgroupRelationEntity = AttrAttrgroupRelationEntity().apply {
                attrId = attr.attrId
                attrGroupId = attr.attrGroupId
            }
            val count = relationDao.selectCount(QueryWrapper<AttrAttrgroupRelationEntity>().eq("attr_id", attr.attrId))
            if (count > 0) {
                relationDao.update(
                    attrAttrgroupRelationEntity,
                    UpdateWrapper<AttrAttrgroupRelationEntity>().eq("attr_id", attr.attrId)
                )
            } else {
                relationDao.insert(attrAttrgroupRelationEntity)
            }
        }
    }

    override fun deleteRelation(vos: Array<AttrAttrgroupRelationEntity>) {
        relationDao.deleteBatchRelation(vos.toList())
    }

    override fun getRelationAttr(attrGroupId: Long): List<AttrEntity> {
        val entities =
            relationDao.selectList(QueryWrapper<AttrAttrgroupRelationEntity>().eq("attr_group_id", attrGroupId))
        val attrIds = entities.map {
            it?.attrId
        }
        if (attrIds.isEmpty()){
            return emptyList()
        }
        return this.listByIds(attrIds)
    }

    /**
     * 获取当前分组没有关联的所有属性
     */
    override fun getNoRelationAttr(params: Map<String, Any>, attrGroupId: Long): PageUtils {
        //当前分组只能关联自己所属的分类里面的所有属性
        val attrGroupEntity = attrGroupDao.selectById(attrGroupId)
        val catelogId = attrGroupEntity?.catelogId
        //当前分组只能关联别的分组没有引用的属性
        //1.当前分类下的其他分组
        val group = attrGroupDao.selectList(
            QueryWrapper<AttrGroupEntity>().eq("catelog_id", catelogId)
        )
        val groupIds = group.map {
            it?.attrGroupId
        }
        //2.这些分组关联的属性
        val groupId = relationDao.selectList(QueryWrapper<AttrAttrgroupRelationEntity>().`in`("attr_group_id", groupIds))
        //3.从当前分类的所有属性中移除这些属性
        val attrIds = groupId.map {
            it?.attrId
        }
        val wrapper = QueryWrapper<AttrEntity>().eq("catelog_id", catelogId)
        if (!attrIds.isNullOrEmpty()) {
            wrapper.notIn("attr_id", attrIds)
        }
        val key = params["key"] as String?
        if (!key.isNullOrEmpty()) {
            wrapper.and {
                it.eq("attr_id", key).or().like("attr_name", key)
            }
        }
        return PageUtils(page(Query<AttrEntity>().getPage(params), wrapper))
    }
}