package com.ace.gulimall.coupon.service

import com.ace.gulimall.common.utils.PageUtils
import com.ace.gulimall.coupon.entity.CouponEntity
import com.baomidou.mybatisplus.extension.service.IService

/**
 * 优惠券信息
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-17 14:24:23
 */
interface CouponService : IService<CouponEntity?> {
    fun queryPage(params: Map<String?, Any?>?): PageUtils
}