package com.ace.gulimall.coupon.service

import com.ace.gulimall.coupon.entity.SkuFullReductionEntity
import com.baomidou.mybatisplus.extension.service.IService
import com.ace.gulimall.common.utils.PageUtils

/**
 * 商品满减信息
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-17 14:24:23
 */
interface SkuFullReductionService : IService<SkuFullReductionEntity?> {
    fun queryPage(params: Map<String?, Any?>?): PageUtils
}