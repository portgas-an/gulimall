package com.ace.gulimall.order.service.impl

import com.ace.gulimall.common.utils.PageUtils
import com.ace.gulimall.common.utils.Query
import com.ace.gulimall.order.dao.OrderReturnApplyDao
import com.ace.gulimall.order.entity.OrderReturnApplyEntity
import com.ace.gulimall.order.service.OrderReturnApplyService
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import org.springframework.stereotype.Service

@Service("orderReturnApplyService")
class OrderReturnApplyServiceImpl : ServiceImpl<OrderReturnApplyDao?, OrderReturnApplyEntity?>(),
    OrderReturnApplyService {
    override fun queryPage(params: Map<String?, Any?>?): PageUtils {
        val page = this.page(
            Query<OrderReturnApplyEntity>().getPage(params),
            QueryWrapper()
        )
        return PageUtils(page)
    }
}