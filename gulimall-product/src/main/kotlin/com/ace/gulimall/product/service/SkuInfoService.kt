package com.ace.gulimall.product.service

import com.ace.gulimall.product.entity.SkuInfoEntity
import com.baomidou.mybatisplus.extension.service.IService

/**
 * sku信息
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-16 16:28:06
 */
interface SkuInfoService : IService<SkuInfoEntity?> {
    fun queryPage(params: Map<String?, Any?>?): PageUtils
}