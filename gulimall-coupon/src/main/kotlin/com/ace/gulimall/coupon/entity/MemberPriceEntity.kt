package com.ace.gulimall.coupon.entity

import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableName
import java.io.Serializable
import java.math.BigDecimal

/**
 * 商品会员价格
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-17 14:24:23
 */
@TableName("sms_member_price")
class MemberPriceEntity : Serializable {
    /**
     * id
     */
    @TableId
    var id: Long? = null

    /**
     * sku_id
     */
    var skuId: Long? = null

    /**
     * 会员等级id
     */
    var memberLevelId: Long? = null

    /**
     * 会员等级名
     */
    var memberLevelName: String? = null

    /**
     * 会员对应价格
     */
    var memberPrice: BigDecimal? = null

    /**
     * 可否叠加其他优惠[0-不可叠加优惠，1-可叠加]
     */
    var addOther: Int? = null

    companion object {
        private const val serialVersionUID = 1L
    }
}