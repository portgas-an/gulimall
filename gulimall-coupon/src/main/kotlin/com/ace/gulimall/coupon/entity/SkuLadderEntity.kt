package com.ace.gulimall.coupon.entity

import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableName
import java.io.Serializable
import java.math.BigDecimal

/**
 * 商品阶梯价格
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-17 14:24:23
 */
@TableName("sms_sku_ladder")
class SkuLadderEntity : Serializable {
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
     * 满几件
     */
    var fullCount: Int? = null

    /**
     * 打几折
     */
    var discount: BigDecimal? = null

    /**
     * 折后价
     */
    var price: BigDecimal? = null

    /**
     * 是否叠加其他优惠[0-不可叠加，1-可叠加]
     */
    var addOther: Int? = null

    companion object {
        private const val serialVersionUID = 1L
    }
}