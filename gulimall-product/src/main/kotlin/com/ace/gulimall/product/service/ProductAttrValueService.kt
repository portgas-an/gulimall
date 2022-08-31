package com.ace.gulimall.product.service

import com.ace.gulimall.product.entity.ProductAttrValueEntity
import com.baomidou.mybatisplus.extension.service.IService

/**
 * spu属性值
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-16 16:28:06
 */
interface ProductAttrValueService : IService<ProductAttrValueEntity?> {
    fun queryPage(params: Map<String?, Any?>?): PageUtils
}