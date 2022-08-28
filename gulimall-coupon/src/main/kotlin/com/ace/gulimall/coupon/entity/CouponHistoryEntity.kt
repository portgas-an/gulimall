package com.ace.gulimall.coupon.entity

import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableName
import java.io.Serializable
import java.util.*

/**
 * 优惠券领取历史记录
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-17 14:24:23
 */
@TableName("sms_coupon_history")
class CouponHistoryEntity : Serializable {
    /**
     * id
     */
    @TableId
    var id: Long? = null

    /**
     * 优惠券id
     */
    var couponId: Long? = null

    /**
     * 会员id
     */
    var memberId: Long? = null

    /**
     * 会员名字
     */
    var memberNickName: String? = null

    /**
     * 获取方式[0->后台赠送；1->主动领取]
     */
    var getType: Int? = null

    /**
     * 创建时间
     */
    var createTime: Date? = null

    /**
     * 使用状态[0->未使用；1->已使用；2->已过期]
     */
    var useType: Int? = null

    /**
     * 使用时间
     */
    var useTime: Date? = null

    /**
     * 订单id
     */
    var orderId: Long? = null

    /**
     * 订单号
     */
    var orderSn: Long? = null

    companion object {
        private const val serialVersionUID = 1L
    }
}