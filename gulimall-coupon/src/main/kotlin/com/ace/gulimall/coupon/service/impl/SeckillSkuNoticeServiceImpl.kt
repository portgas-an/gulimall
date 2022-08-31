package com.ace.gulimall.coupon.service.impl

import com.ace.gulimall.common.utils.PageUtils
import com.ace.gulimall.common.utils.Query
import com.ace.gulimall.coupon.dao.SeckillSkuNoticeDao
import com.ace.gulimall.coupon.entity.SeckillSkuNoticeEntity
import com.ace.gulimall.coupon.service.SeckillSkuNoticeService
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import org.springframework.stereotype.Service

@Service("seckillSkuNoticeService")
class SeckillSkuNoticeServiceImpl : ServiceImpl<SeckillSkuNoticeDao?, SeckillSkuNoticeEntity?>(),
    SeckillSkuNoticeService {
    override fun queryPage(params: Map<String?, Any?>?): PageUtils {
        val page = this.page(
            Query<SeckillSkuNoticeEntity>().getPage(params),
            QueryWrapper()
        )
        return PageUtils(page)
    }
}