package com.ace.gulimall.order.entity

import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableName
import java.io.Serializable
import java.math.BigDecimal
import java.util.*

/**
 * 支付信息表
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-17 15:30:03
 */
@TableName("oms_payment_info")
class PaymentInfoEntity : Serializable {
    /**
     * id
     */
    @TableId
    var id: Long? = null

    /**
     * 订单号（对外业务号）
     */
    var orderSn: String? = null

    /**
     * 订单id
     */
    var orderId: Long? = null

    /**
     * 支付宝交易流水号
     */
    var alipayTradeNo: String? = null

    /**
     * 支付总金额
     */
    var totalAmount: BigDecimal? = null

    /**
     * 交易内容
     */
    var subject: String? = null

    /**
     * 支付状态
     */
    var paymentStatus: String? = null

    /**
     * 创建时间
     */
    var createTime: Date? = null

    /**
     * 确认时间
     */
    var confirmTime: Date? = null

    /**
     * 回调内容
     */
    var callbackContent: String? = null

    /**
     * 回调时间
     */
    var callbackTime: Date? = null

    companion object {
        private const val serialVersionUID = 1L
    }
}