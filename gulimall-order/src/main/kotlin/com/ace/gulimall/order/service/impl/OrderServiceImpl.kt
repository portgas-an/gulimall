package com.ace.gulimall.order.service.impl

import com.ace.gulimall.common.utils.PageUtils
import com.ace.gulimall.common.utils.Query
import com.ace.gulimall.order.dao.OrderDao
import com.ace.gulimall.order.entity.OrderEntity
import com.ace.gulimall.order.service.OrderService
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import org.springframework.stereotype.Service

@Service("orderService")
class OrderServiceImpl : ServiceImpl<OrderDao?, OrderEntity?>(), OrderService {
    override fun queryPage(params: Map<String?, Any?>?): PageUtils {
        val page = this.page(
            Query<OrderEntity>().getPage(params),
            QueryWrapper()
        )
        return PageUtils(page)
    }
}