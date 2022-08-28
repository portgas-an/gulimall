package com.ace.gulimall.coupon.entity

import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableName
import java.io.Serializable

/**
 * 优惠券与产品关联
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-17 14:24:23
 */
@TableName("sms_coupon_spu_relation")
class CouponSpuRelationEntity : Serializable {
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
     * spu_id
     */
    var spuId: Long? = null

    /**
     * spu_name
     */
    var spuName: String? = null

    companion object {
        private const val serialVersionUID = 1L
    }
}