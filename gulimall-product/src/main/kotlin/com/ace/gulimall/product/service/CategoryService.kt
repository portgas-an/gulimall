package com.ace.gulimall.product.service

import com.ace.gulimall.common.utils.PageUtils
import com.ace.gulimall.product.entity.CategoryEntity
import com.baomidou.mybatisplus.extension.service.IService

/**
 * 商品三级分类
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-16 16:28:06
 */
interface CategoryService : IService<CategoryEntity> {
    fun queryPage(params: Map<String?, Any?>?): PageUtils
    fun listWithTree(): List<CategoryEntity>?
    fun removeMeunByIds(listOf: List<Long>)

    /**
     * 找到attrGroupId完整路径
     * [父/子/...]
     * @param catelogId
     * @return
     */
    fun findCategoryPath(catelogId: Long): LongArray
    fun updateCascade(category: CategoryEntity)
}