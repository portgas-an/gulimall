package com.ace.gulimall.coupon.service

import com.ace.gulimall.coupon.entity.CouponHistoryEntity
import com.baomidou.mybatisplus.extension.service.IService
import com.ace.gulimall.common.utils.PageUtils

/**
 * 优惠券领取历史记录
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-17 14:24:23
 */
interface CouponHistoryService : IService<CouponHistoryEntity?> {
    fun queryPage(params: Map<String?, Any?>?): PageUtils
}