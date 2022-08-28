package com.ace.gulimall.coupon.entity

import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableName
import java.io.Serializable
import java.math.BigDecimal
import java.util.*

/**
 * 优惠券信息
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-17 14:24:23
 */
@TableName("sms_coupon")
class CouponEntity : Serializable {
    /**
     * id
     */
    @TableId
    var id: Long? = null

    /**
     * 优惠卷类型[0->全场赠券；1->会员赠券；2->购物赠券；3->注册赠券]
     */
    var couponType: Int? = null

    /**
     * 优惠券图片
     */
    var couponImg: String? = null

    /**
     * 优惠卷名字
     */
    var couponName: String? = null

    /**
     * 数量
     */
    var num: Int? = null

    /**
     * 金额
     */
    var amount: BigDecimal? = null

    /**
     * 每人限领张数
     */
    var perLimit: Int? = null

    /**
     * 使用门槛
     */
    var minPoint: BigDecimal? = null

    /**
     * 开始时间
     */
    var startTime: Date? = null

    /**
     * 结束时间
     */
    var endTime: Date? = null

    /**
     * 使用类型[0->全场通用；1->指定分类；2->指定商品]
     */
    var useType: Int? = null

    /**
     * 备注
     */
    var note: String? = null

    /**
     * 发行数量
     */
    var publishCount: Int? = null

    /**
     * 已使用数量
     */
    var useCount: Int? = null

    /**
     * 领取数量
     */
    var receiveCount: Int? = null

    /**
     * 可以领取的开始日期
     */
    var enableStartTime: Date? = null

    /**
     * 可以领取的结束日期
     */
    var enableEndTime: Date? = null

    /**
     * 优惠码
     */
    var code: String? = null

    /**
     * 可以领取的会员等级[0->不限等级，其他-对应等级]
     */
    var memberLevel: Int? = null

    /**
     * 发布状态[0-未发布，1-已发布]
     */
    var publish: Int? = null

    companion object {
        private const val serialVersionUID = 1L
    }
}