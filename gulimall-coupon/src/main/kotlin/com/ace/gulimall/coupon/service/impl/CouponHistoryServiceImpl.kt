package com.ace.gulimall.coupon.service.impl

import com.ace.gulimall.coupon.dao.CouponHistoryDao
import com.ace.gulimall.coupon.entity.CouponHistoryEntity
import com.ace.gulimall.coupon.service.CouponHistoryService
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import com.ace.gulimall.common.utils.PageUtils
import com.ace.gulimall.common.utils.Query
import org.springframework.stereotype.Service

@Service("couponHistoryService")
class CouponHistoryServiceImpl : ServiceImpl<CouponHistoryDao?, CouponHistoryEntity?>(), CouponHistoryService {
    override fun queryPage(params: Map<String?, Any?>?): PageUtils {
        val page = this.page(
            Query<CouponHistoryEntity>().getPage(params),
            QueryWrapper()
        )
        return PageUtils(page)
    }
}