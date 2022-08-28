package com.ace.gulimall.coupon.entity

import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableName
import java.io.Serializable
import java.math.BigDecimal

/**
 * 秒杀活动商品关联
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-17 14:24:23
 */
@TableName("sms_seckill_sku_relation")
class SeckillSkuRelationEntity : Serializable {
    /**
     * id
     */
    @TableId
    var id: Long? = null

    /**
     * 活动id
     */
    var promotionId: Long? = null

    /**
     * 活动场次id
     */
    var promotionSessionId: Long? = null

    /**
     * 商品id
     */
    var skuId: Long? = null

    /**
     * 秒杀价格
     */
    var seckillPrice: BigDecimal? = null

    /**
     * 秒杀总量
     */
    var seckillCount: BigDecimal? = null

    /**
     * 每人限购数量
     */
    var seckillLimit: BigDecimal? = null

    /**
     * 排序
     */
    var seckillSort: Int? = null

    companion object {
        private const val serialVersionUID = 1L
    }
}