package com.ace.gulimall.order.service

import com.ace.gulimall.order.entity.PaymentInfoEntity
import com.baomidou.mybatisplus.extension.service.IService

/**
 * 支付信息表
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-17 15:30:03
 */
interface PaymentInfoService : IService<PaymentInfoEntity?> {
    fun queryPage(params: Map<String?, Any?>?): PageUtils
}