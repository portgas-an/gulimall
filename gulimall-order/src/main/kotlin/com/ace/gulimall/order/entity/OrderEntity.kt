package com.ace.gulimall.order.entity

import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableName
import java.io.Serializable
import java.math.BigDecimal
import java.util.*

/**
 * 订单
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-17 15:30:03
 */
@TableName("oms_order")
class OrderEntity : Serializable {
    /**
     * id
     */
    @TableId
    var id: Long? = null

    /**
     * member_id
     */
    var memberId: Long? = null

    /**
     * 订单号
     */
    var orderSn: String? = null

    /**
     * 使用的优惠券
     */
    var couponId: Long? = null

    /**
     * create_time
     */
    var createTime: Date? = null

    /**
     * 用户名
     */
    var memberUsername: String? = null

    /**
     * 订单总额
     */
    var totalAmount: BigDecimal? = null

    /**
     * 应付总额
     */
    var payAmount: BigDecimal? = null

    /**
     * 运费金额
     */
    var freightAmount: BigDecimal? = null

    /**
     * 促销优化金额（促销价、满减、阶梯价）
     */
    var promotionAmount: BigDecimal? = null

    /**
     * 积分抵扣金额
     */
    var integrationAmount: BigDecimal? = null

    /**
     * 优惠券抵扣金额
     */
    var couponAmount: BigDecimal? = null

    /**
     * 后台调整订单使用的折扣金额
     */
    var discountAmount: BigDecimal? = null

    /**
     * 支付方式【1->支付宝；2->微信；3->银联； 4->货到付款；】
     */
    var payType: Int? = null

    /**
     * 订单来源[0->PC订单；1->app订单]
     */
    var sourceType: Int? = null

    /**
     * 订单状态【0->待付款；1->待发货；2->已发货；3->已完成；4->已关闭；5->无效订单】
     */
    var status: Int? = null

    /**
     * 物流公司(配送方式)
     */
    var deliveryCompany: String? = null

    /**
     * 物流单号
     */
    var deliverySn: String? = null

    /**
     * 自动确认时间（天）
     */
    var autoConfirmDay: Int? = null

    /**
     * 可以获得的积分
     */
    var integration: Int? = null

    /**
     * 可以获得的成长值
     */
    var growth: Int? = null

    /**
     * 发票类型[0->不开发票；1->电子发票；2->纸质发票]
     */
    var billType: Int? = null

    /**
     * 发票抬头
     */
    var billHeader: String? = null

    /**
     * 发票内容
     */
    var billContent: String? = null

    /**
     * 收票人电话
     */
    var billReceiverPhone: String? = null

    /**
     * 收票人邮箱
     */
    var billReceiverEmail: String? = null

    /**
     * 收货人姓名
     */
    var receiverName: String? = null

    /**
     * 收货人电话
     */
    var receiverPhone: String? = null

    /**
     * 收货人邮编
     */
    var receiverPostCode: String? = null

    /**
     * 省份/直辖市
     */
    var receiverProvince: String? = null

    /**
     * 城市
     */
    var receiverCity: String? = null

    /**
     * 区
     */
    var receiverRegion: String? = null

    /**
     * 详细地址
     */
    var receiverDetailAddress: String? = null

    /**
     * 订单备注
     */
    var note: String? = null

    /**
     * 确认收货状态[0->未确认；1->已确认]
     */
    var confirmStatus: Int? = null

    /**
     * 删除状态【0->未删除；1->已删除】
     */
    var deleteStatus: Int? = null

    /**
     * 下单时使用的积分
     */
    var useIntegration: Int? = null

    /**
     * 支付时间
     */
    var paymentTime: Date? = null

    /**
     * 发货时间
     */
    var deliveryTime: Date? = null

    /**
     * 确认收货时间
     */
    var receiveTime: Date? = null

    /**
     * 评价时间
     */
    var commentTime: Date? = null

    /**
     * 修改时间
     */
    var modifyTime: Date? = null

    companion object {
        private const val serialVersionUID = 1L
    }
}