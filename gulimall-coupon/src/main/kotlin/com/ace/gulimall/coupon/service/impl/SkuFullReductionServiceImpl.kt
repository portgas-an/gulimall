package com.ace.gulimall.coupon.service.impl

import com.ace.gulimall.common.utils.PageUtils
import com.ace.gulimall.common.utils.Query
import com.ace.gulimall.coupon.dao.SkuFullReductionDao
import com.ace.gulimall.coupon.entity.SkuFullReductionEntity
import com.ace.gulimall.coupon.service.SkuFullReductionService
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import org.springframework.stereotype.Service

@Service("skuFullReductionService")
class SkuFullReductionServiceImpl : ServiceImpl<SkuFullReductionDao?, SkuFullReductionEntity?>(),
    SkuFullReductionService {
    override fun queryPage(params: Map<String?, Any?>?): PageUtils {
        val page = this.page(
            Query<SkuFullReductionEntity>().getPage(params),
            QueryWrapper()
        )
        return PageUtils(page)
    }
}