package com.ace.gulimall.coupon.entity

import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableName
import java.io.Serializable

/**
 * 优惠券分类关联
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-17 14:24:23
 */
@TableName("sms_coupon_spu_category_relation")
class CouponSpuCategoryRelationEntity : Serializable {
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
     * 产品分类id
     */
    var categoryId: Long? = null

    /**
     * 产品分类名称
     */
    var categoryName: String? = null

    companion object {
        private const val serialVersionUID = 1L
    }
}