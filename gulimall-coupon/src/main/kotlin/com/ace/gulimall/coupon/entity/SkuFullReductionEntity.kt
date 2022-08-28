package com.ace.gulimall.coupon.entity

import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableName
import java.io.Serializable
import java.math.BigDecimal

/**
 * 商品满减信息
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-17 14:24:23
 */
@TableName("sms_sku_full_reduction")
class SkuFullReductionEntity : Serializable {
    /**
     * id
     */
    @TableId
    var id: Long? = null

    /**
     * spu_id
     */
    var skuId: Long? = null

    /**
     * 满多少
     */
    var fullPrice: BigDecimal? = null

    /**
     * 减多少
     */
    var reducePrice: BigDecimal? = null

    /**
     * 是否参与其他优惠
     */
    var addOther: Int? = null

    companion object {
        private const val serialVersionUID = 1L
    }
}