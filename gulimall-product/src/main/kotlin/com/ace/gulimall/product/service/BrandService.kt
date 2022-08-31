package com.ace.gulimall.product.service

import com.ace.gulimall.product.entity.BrandEntity
import com.baomidou.mybatisplus.extension.service.IService

/**
 * 品牌
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-16 16:28:06
 */
interface BrandService : IService<BrandEntity?> {
    fun queryPage(params: Map<String?, Any?>?): PageUtils
}