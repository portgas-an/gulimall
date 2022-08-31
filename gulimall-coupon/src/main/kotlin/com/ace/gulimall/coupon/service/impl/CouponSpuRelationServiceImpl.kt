package com.ace.gulimall.coupon.service.impl

import com.ace.gulimall.common.utils.PageUtils
import com.ace.gulimall.common.utils.Query
import com.ace.gulimall.coupon.dao.CouponSpuRelationDao
import com.ace.gulimall.coupon.entity.CouponSpuRelationEntity
import com.ace.gulimall.coupon.service.CouponSpuRelationService
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import org.springframework.stereotype.Service

@Service("couponSpuRelationService")
class CouponSpuRelationServiceImpl : ServiceImpl<CouponSpuRelationDao?, CouponSpuRelationEntity>(),
    CouponSpuRelationService {
    override fun queryPage(params: Map<String?, Any?>?): PageUtils {
        val page = this.page(
            Query<CouponSpuRelationEntity>().getPage(params),
            QueryWrapper()
        )
        return PageUtils(page)
    }
}