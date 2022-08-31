package com.ace.gulimall.order.service.impl

import com.ace.gulimall.order.dao.OrderItemDao
import com.ace.gulimall.order.entity.OrderItemEntity
import com.ace.gulimall.order.service.OrderItemService
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import org.springframework.stereotype.Service

@Service("orderItemService")
class OrderItemServiceImpl : ServiceImpl<OrderItemDao?, OrderItemEntity?>(), OrderItemService {
    override fun queryPage(params: Map<String?, Any?>?): PageUtils {
        val page = this.page(
            Query<OrderItemEntity>().getPage(params),
            QueryWrapper()
        )
        return PageUtils(page)
    }
}