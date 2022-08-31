package com.ace.gulimall.order.service

import com.ace.gulimall.order.entity.OrderOperateHistoryEntity
import com.baomidou.mybatisplus.extension.service.IService

/**
 * 订单操作历史记录
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-17 15:30:03
 */
interface OrderOperateHistoryService : IService<OrderOperateHistoryEntity?> {
    fun queryPage(params: Map<String?, Any?>?): PageUtils
}