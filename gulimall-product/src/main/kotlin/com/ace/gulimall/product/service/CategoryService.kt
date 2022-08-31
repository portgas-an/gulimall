package com.ace.gulimall.product.service

import com.ace.gulimall.product.entity.CategoryEntity
import com.baomidou.mybatisplus.extension.service.IService

/**
 * 商品三级分类
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-16 16:28:06
 */
interface CategoryService : IService<CategoryEntity?> {
    fun queryPage(params: Map<String?, Any?>?): PageUtils
}