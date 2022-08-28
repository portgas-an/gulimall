package com.ace.gulimall.coupon.service

import com.ace.gulimall.coupon.entity.CouponSpuCategoryRelationEntity
import com.baomidou.mybatisplus.extension.service.IService
import com.ace.gulimall.common.utils.PageUtils

/**
 * 优惠券分类关联
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-17 14:24:23
 */
interface CouponSpuCategoryRelationService : IService<CouponSpuCategoryRelationEntity?> {
    fun queryPage(params: Map<String?, Any?>?): PageUtils
}