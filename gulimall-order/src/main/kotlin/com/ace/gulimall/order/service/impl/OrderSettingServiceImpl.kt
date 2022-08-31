package com.ace.gulimall.order.service.impl

import com.ace.gulimall.order.dao.OrderSettingDao
import com.ace.gulimall.order.entity.OrderSettingEntity
import com.ace.gulimall.order.service.OrderSettingService
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import org.springframework.stereotype.Service

@Service("orderSettingService")
class OrderSettingServiceImpl : ServiceImpl<OrderSettingDao?, OrderSettingEntity?>(), OrderSettingService {
    override fun queryPage(params: Map<String?, Any?>?): PageUtils {
        val page = this.page(
            Query<OrderSettingEntity>().getPage(params),
            QueryWrapper()
        )
        return PageUtils(page)
    }
}