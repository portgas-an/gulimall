package com.ace.gulimall.coupon.service.impl

import com.ace.gulimall.common.utils.PageUtils
import com.ace.gulimall.common.utils.Query
import com.ace.gulimall.coupon.dao.CouponDao
import com.ace.gulimall.coupon.entity.CouponEntity
import com.ace.gulimall.coupon.service.CouponService
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import org.springframework.stereotype.Service

@Service("couponService")
class CouponServiceImpl : ServiceImpl<CouponDao?, CouponEntity?>(), CouponService {
    override fun queryPage(params: Map<String?, Any?>?): PageUtils {
        val page = this.page(
            Query<CouponEntity>().getPage(params),
            QueryWrapper()
        )
        return PageUtils(page)
    }
}