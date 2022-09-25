package com.ace.gulimall.product.service.impl

import com.ace.gulimall.common.utils.PageUtils
import com.ace.gulimall.common.utils.Query
import com.ace.gulimall.product.dao.CategoryDao
import com.ace.gulimall.product.entity.CategoryEntity
import com.ace.gulimall.product.service.CategoryService
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import org.springframework.stereotype.Service

@Service("categoryService")
class CategoryServiceImpl : ServiceImpl<CategoryDao, CategoryEntity>(), CategoryService {

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