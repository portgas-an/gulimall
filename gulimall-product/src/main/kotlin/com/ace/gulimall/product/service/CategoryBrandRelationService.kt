package com.ace.gulimall.product.service

import com.ace.gulimall.product.entity.CategoryBrandRelationEntity
import com.baomidou.mybatisplus.extension.service.IService
import com.ace.gulimall.common.utils.PageUtils


/**
 * 品牌分类关联
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-16 16:28:06
 */
interface CategoryBrandRelationService : IService<CategoryBrandRelationEntity?> {
    fun queryPage(params: Map<String?, Any?>?): PageUtils
}