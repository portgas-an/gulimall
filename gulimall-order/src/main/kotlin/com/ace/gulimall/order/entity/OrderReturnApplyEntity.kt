package com.ace.gulimall.order.entity

import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableName
import java.io.Serializable
import java.math.BigDecimal
import java.util.*

/**
 * 订单退货申请
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-17 15:30:03
 */
@TableName("oms_order_return_apply")
class OrderReturnApplyEntity : Serializable {
    /**
     * id
     */
    @TableId
    var id: Long? = null

    /**
     * order_id
     */
    var orderId: Long? = null

    /**
     * 退货商品id
     */
    var skuId: Long? = null

    /**
     * 订单编号
     */
    var orderSn: String? = null

    /**
     * 申请时间
     */
    var createTime: Date? = null

    /**
     * 会员用户名
     */
    var memberUsername: String? = null

    /**
     * 退款金额
     */
    var returnAmount: BigDecimal? = null

    /**
     * 退货人姓名
     */
    var returnName: String? = null

    /**
     * 退货人电话
     */
    var returnPhone: String? = null

    /**
     * 申请状态[0->待处理；1->退货中；2->已完成；3->已拒绝]
     */
    var status: Int? = null

    /**
     * 处理时间
     */
    var handleTime: Date? = null

    /**
     * 商品图片
     */
    var skuImg: String? = null

    /**
     * 商品名称
     */
    var skuName: String? = null

    /**
     * 商品品牌
     */
    var skuBrand: String? = null

    /**
     * 商品销售属性(JSON)
     */
    var skuAttrsVals: String? = null

    /**
     * 退货数量
     */
    var skuCount: Int? = null

    /**
     * 商品单价
     */
    var skuPrice: BigDecimal? = null

    /**
     * 商品实际支付单价
     */
    var skuRealPrice: BigDecimal? = null

    /**
     * 原因
     */
    var reason: String? = null

    /**
     * 描述
     */
    var description述: String? = null

    /**
     * 凭证图片，以逗号隔开
     */
    var descPics: String? = null

    /**
     * 处理备注
     */
    var handleNote: String? = null

    /**
     * 处理人员
     */
    var handleMan: String? = null

    /**
     * 收货人
     */
    var receiveMan: String? = null

    /**
     * 收货时间
     */
    var receiveTime: Date? = null

    /**
     * 收货备注
     */
    var receiveNote: String? = null

    /**
     * 收货电话
     */
    var receivePhone: String? = null

    /**
     * 公司收货地址
     */
    var companyAddress: String? = null

    companion object {
        private const val serialVersionUID = 1L
    }
}