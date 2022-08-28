package com.ace.gulimall.order.service.impl

import com.ace.gulimall.common.utils.PageUtils
import com.ace.gulimall.common.utils.Query
import com.ace.gulimall.order.dao.OrderOperateHistoryDao
import com.ace.gulimall.order.entity.OrderOperateHistoryEntity
import com.ace.gulimall.order.service.OrderOperateHistoryService
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import org.springframework.stereotype.Service

@Service("orderOperateHistoryService")
class OrderOperateHistoryServiceImpl : ServiceImpl<OrderOperateHistoryDao?, OrderOperateHistoryEntity?>(),
    OrderOperateHistoryService {
    override fun queryPage(params: Map<String?, Any?>?): PageUtils {
        val page = this.page(
            Query<OrderOperateHistoryEntity>().getPage(params),
            QueryWrapper()
        )
        return PageUtils(page)
    }
}