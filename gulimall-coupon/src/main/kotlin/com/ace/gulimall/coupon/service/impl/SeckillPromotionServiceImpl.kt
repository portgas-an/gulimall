package com.ace.gulimall.coupon.service.impl

import com.ace.gulimall.coupon.dao.SeckillPromotionDao
import com.ace.gulimall.coupon.entity.SeckillPromotionEntity
import com.ace.gulimall.coupon.service.SeckillPromotionService
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import com.ace.gulimall.common.utils.PageUtils
import com.ace.gulimall.common.utils.Query
import org.springframework.stereotype.Service

@Service("seckillPromotionService")
class SeckillPromotionServiceImpl : ServiceImpl<SeckillPromotionDao?, SeckillPromotionEntity?>(),
    SeckillPromotionService {
    override fun queryPage(params: Map<String?, Any?>?): PageUtils {
        val page = this.page(
            Query<SeckillPromotionEntity>().getPage(params),
            QueryWrapper()
        )
        return PageUtils(page)
    }
}