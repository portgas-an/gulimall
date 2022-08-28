package com.ace.gulimall.order.service

import com.ace.gulimall.common.utils.PageUtils
import com.ace.gulimall.order.entity.OrderEntity
import com.baomidou.mybatisplus.extension.service.IService

/**
 * 订单
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-17 15:30:03
 */
interface OrderService : IService<OrderEntity?> {
    fun queryPage(params: Map<String?, Any?>?): PageUtils
}