package com.ace.gulimall.order.service.impl

import com.ace.gulimall.common.utils.PageUtils
import com.ace.gulimall.common.utils.Query
import com.ace.gulimall.order.dao.OrderReturnReasonDao
import com.ace.gulimall.order.entity.OrderReturnReasonEntity
import com.ace.gulimall.order.service.OrderReturnReasonService
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import org.springframework.stereotype.Service

@Service("orderReturnReasonService")
class OrderReturnReasonServiceImpl : ServiceImpl<OrderReturnReasonDao?, OrderReturnReasonEntity?>(),
    OrderReturnReasonService {
    override fun queryPage(params: Map<String?, Any?>?): PageUtils {
        val page = this.page(
            Query<OrderReturnReasonEntity>().getPage(params),
            QueryWrapper()
        )
        return PageUtils(page)
    }
}