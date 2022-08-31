package com.ace.gulimall.product.service

import com.ace.gulimall.product.entity.SkuSaleAttrValueEntity
import com.baomidou.mybatisplus.extension.service.IService

/**
 * sku销售属性&值
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-16 16:28:06
 */
interface SkuSaleAttrValueService : IService<SkuSaleAttrValueEntity?> {
    fun queryPage(params: Map<String?, Any?>?): PageUtils
}