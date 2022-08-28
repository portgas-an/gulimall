package com.ace.gulimall.order.entity

import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableName
import java.io.Serializable
import java.math.BigDecimal

/**
 * 退款信息
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-17 15:30:03
 */
@TableName("oms_refund_info")
class RefundInfoEntity : Serializable {
    /**
     * id
     */
    @TableId
    var id: Long? = null

    /**
     * 退款的订单
     */
    var orderReturnId: Long? = null

    /**
     * 退款金额
     */
    var refund: BigDecimal? = null

    /**
     * 退款交易流水号
     */
    var refundSn: String? = null

    /**
     * 退款状态
     */
    var refundStatus: Int? = null

    /**
     * 退款渠道[1-支付宝，2-微信，3-银联，4-汇款]
     */
    var refundChannel: Int? = null

    /**
     *
     */
    var refundContent: String? = null

    companion object {
        private const val serialVersionUID = 1L
    }
}