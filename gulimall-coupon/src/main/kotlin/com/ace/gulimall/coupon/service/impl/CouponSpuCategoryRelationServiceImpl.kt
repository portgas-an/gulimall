package com.ace.gulimall.coupon.service.impl

import com.ace.gulimall.common.utils.PageUtils
import com.ace.gulimall.common.utils.Query
import com.ace.gulimall.coupon.dao.CouponSpuCategoryRelationDao
import com.ace.gulimall.coupon.entity.CouponSpuCategoryRelationEntity
import com.ace.gulimall.coupon.service.CouponSpuCategoryRelationService
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import org.springframework.stereotype.Service

@Service("couponSpuCategoryRelationService")
class CouponSpuCategoryRelationServiceImpl :
    ServiceImpl<CouponSpuCategoryRelationDao?, CouponSpuCategoryRelationEntity?>(), CouponSpuCategoryRelationService {
    override fun queryPage(params: Map<String?, Any?>?): PageUtils {
        val page = this.page(
            Query<CouponSpuCategoryRelationEntity>().getPage(params),
            QueryWrapper()
        )
        return PageUtils(page)
    }
}