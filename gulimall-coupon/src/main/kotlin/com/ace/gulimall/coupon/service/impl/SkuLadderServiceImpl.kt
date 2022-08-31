package com.ace.gulimall.coupon.service.impl

import com.ace.gulimall.common.utils.PageUtils
import com.ace.gulimall.common.utils.Query
import com.ace.gulimall.coupon.dao.SkuLadderDao
import com.ace.gulimall.coupon.entity.SkuLadderEntity
import com.ace.gulimall.coupon.service.SkuLadderService
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import org.springframework.stereotype.Service

@Service("skuLadderService")
class SkuLadderServiceImpl : ServiceImpl<SkuLadderDao?, SkuLadderEntity?>(), SkuLadderService {
    override fun queryPage(params: Map<String?, Any?>?): PageUtils {
        val page = this.page(
            Query<SkuLadderEntity>().getPage(params),
            QueryWrapper()
        )
        return PageUtils(page)
    }
}