package com.ace.gulimall.coupon.service.impl

import com.ace.gulimall.common.utils.PageUtils
import com.ace.gulimall.common.utils.Query
import com.ace.gulimall.coupon.dao.SeckillSessionDao
import com.ace.gulimall.coupon.entity.SeckillSessionEntity
import com.ace.gulimall.coupon.service.SeckillSessionService
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import org.springframework.stereotype.Service

@Service("seckillSessionService")
class SeckillSessionServiceImpl : ServiceImpl<SeckillSessionDao?, SeckillSessionEntity?>(), SeckillSessionService {
    override fun queryPage(params: Map<String?, Any?>?): PageUtils {
        val page = this.page(
            Query<SeckillSessionEntity>().getPage(params),
            QueryWrapper()
        )
        return PageUtils(page)
    }
}