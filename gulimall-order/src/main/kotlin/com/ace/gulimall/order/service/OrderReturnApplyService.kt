package com.ace.gulimall.order.service

import com.ace.gulimall.order.entity.OrderReturnApplyEntity
import com.baomidou.mybatisplus.extension.service.IService

/**
 * 订单退货申请
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-17 15:30:03
 */
interface OrderReturnApplyService : IService<OrderReturnApplyEntity?> {
    fun queryPage(params: Map<String?, Any?>?): PageUtils
}