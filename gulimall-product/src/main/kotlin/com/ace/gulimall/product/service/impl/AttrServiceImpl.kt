package com.ace.gulimall.product.service.impl

import com.ace.gulimall.common.utils.PageUtils
import com.ace.gulimall.common.utils.Query
import com.ace.gulimall.product.dao.AttrAttrgroupRelationDao
import com.ace.gulimall.product.dao.AttrDao
import com.ace.gulimall.product.dao.AttrGroupDao
import com.ace.gulimall.product.dao.CategoryDao
import com.ace.gulimall.product.entity.AttrAttrgroupRelationEntity
import com.ace.gulimall.product.entity.AttrEntity
import com.ace.gulimall.product.service.AttrService
import com.ace.gulimall.product.vo.AttrRespVo
import com.ace.gulimall.product.vo.AttrVo
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
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
        val relationEntity = AttrAttrgroupRelationEntity()
        relationEntity.attrGroupId = attr.attrGroupId
        relationEntity.attrId = attrEntity.attrId
        relationDao.insert(relationEntity)
    }

    override fun queryBaseAttrPage(params: Map<String?, Any?>, catelog: Long?): PageUtils {
        val page = this.page(Query<AttrEntity>().getPage(params), QueryWrapper<AttrEntity>().apply {
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
            val attrAttrgroupRelationEntity =
                relationDao.selectOne(QueryWrapper<AttrAttrgroupRelationEntity>().eq("attr_id", it.attrId))
            val attrGroupEntity = attrGroupDao.selectById(attrAttrgroupRelationEntity?.attrGroupId)
            attrGroupEntity?.attrGroupName?.let { name ->
                attrRespVo.groupName = name
            }
            val categoryEntity = categoryDao.selectById(it.catelogId)
            categoryEntity?.name?.let { name ->
                attrRespVo.catelogName = name
            }
            attrRespVo
        }
        return pageUtils
    }
}