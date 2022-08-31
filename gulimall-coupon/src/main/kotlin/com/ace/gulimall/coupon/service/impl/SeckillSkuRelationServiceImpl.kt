package com.ace.gulimall.coupon.service.impl

import com.ace.gulimall.common.utils.PageUtils
import com.ace.gulimall.common.utils.Query
import com.ace.gulimall.coupon.dao.SeckillSkuRelationDao
import com.ace.gulimall.coupon.entity.SeckillSkuRelationEntity
import com.ace.gulimall.coupon.service.SeckillSkuRelationService
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import org.springframework.stereotype.Service

@Service("seckillSkuRelationService")
class SeckillSkuRelationServiceImpl : ServiceImpl<SeckillSkuRelationDao?, SeckillSkuRelationEntity?>(),
    SeckillSkuRelationService {
    override fun queryPage(params: Map<String?, Any?>?): PageUtils {
        val page = this.page(
            Query<SeckillSkuRelationEntity>().getPage(params),
            QueryWrapper()
        )
        return PageUtils(page)
    }
}