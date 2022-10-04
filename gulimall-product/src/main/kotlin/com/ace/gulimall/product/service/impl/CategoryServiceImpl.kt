package com.ace.gulimall.product.service.impl

import com.ace.gulimall.common.utils.PageUtils
import com.ace.gulimall.common.utils.Query
import com.ace.gulimall.product.dao.CategoryDao
import com.ace.gulimall.product.entity.CategoryEntity
import com.ace.gulimall.product.service.CategoryBrandRelationService
import com.ace.gulimall.product.service.CategoryService
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service("categoryService")
class CategoryServiceImpl : ServiceImpl<CategoryDao, CategoryEntity>(), CategoryService {

    @Autowired
    private lateinit var categoryBrandRelationService: CategoryBrandRelationService

    override fun queryPage(params: Map<String?, Any?>?): PageUtils {
        val page = this.page(
            Query<CategoryEntity>().getPage(params),
            QueryWrapper()
        )
        return PageUtils(page)
    }

    override fun listWithTree(): MutableList<CategoryEntity>? {
        //1.查处所有分类
        val entityList = getBaseMapper()?.selectList(null)
        //2.组装父子树形结构
        return getCategoryChild(null, entityList)
    }

    override fun removeMeunByIds(listOf: List<Long>) {
        //todo:检查当前删除的菜单
         getBaseMapper().deleteBatchIds(listOf)
    }

    override fun findCategoryPath(attrGroupId: Long): LongArray {
        val paths = mutableListOf<Long>()
        var findGroupId = attrGroupId
        while (true){
            paths.add(findGroupId)
            var byId = getById(findGroupId)
            if (byId.parentCid != 0L) {
                findGroupId = byId.parentCid!!
            } else {
                break
            }
        }
        paths.reverse()
        print(paths.toString())
        return paths.toLongArray()
    }

    /**
     * 级联更新所有关联数据
     */
    @Transactional
    override fun updateCascade(category: CategoryEntity) {
        this.updateById(category)
        categoryBrandRelationService.updateCategory(category.catId, category.name)
    }


    /**
     * 组装为树状结构
     */
    fun getCategoryChild(parent: CategoryEntity?, all: MutableList<CategoryEntity>?): MutableList<CategoryEntity>? {
        val child = all?.asSequence()?.filter { categoryEntity ->
            categoryEntity.parentCid == parent?.catId ||
            (parent == null && categoryEntity.parentCid == 0L)
        }?.map {
            it.children = getCategoryChild(it, all)
            it
        }?.sortedBy {
            it.sort ?: 0
        }?.toMutableList()
        return child
    }

}