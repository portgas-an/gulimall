package com.ace.gulimall.order.service

import com.ace.gulimall.common.utils.PageUtils
import com.ace.gulimall.order.entity.OrderSettingEntity
import com.baomidou.mybatisplus.extension.service.IService

/**
 * 订单配置信息
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-17 15:30:03
 */
interface OrderSettingService : IService<OrderSettingEntity?> {
    fun queryPage(params: Map<String?, Any?>?): PageUtils
}