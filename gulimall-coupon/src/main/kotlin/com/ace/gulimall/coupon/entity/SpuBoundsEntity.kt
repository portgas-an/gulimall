package com.ace.gulimall.coupon.entity

import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableName
import java.io.Serializable
import java.math.BigDecimal

/**
 * 商品spu积分设置
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-17 14:24:23
 */
@TableName("sms_spu_bounds")
class SpuBoundsEntity : Serializable {
    /**
     * id
     */
    @TableId
    var id: Long? = null

    /**
     *
     */
    var spuId: Long? = null

    /**
     * 成长积分
     */
    var growBounds: BigDecimal? = null

    /**
     * 购物积分
     */
    var buyBounds: BigDecimal? = null

    /**
     * 优惠生效情况[1111（四个状态位，从右到左）;0 - 无优惠，成长积分是否赠送;1 - 无优惠，购物积分是否赠送;2 - 有优惠，成长积分是否赠送;3 - 有优惠，购物积分是否赠送【状态位0：不赠送，1：赠送】]
     */
    var work: Int? = null

    companion object {
        private const val serialVersionUID = 1L
    }
}