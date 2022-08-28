package com.ace.gulimall.product.entity

import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableName
import java.io.Serializable
import java.math.BigDecimal

/**
 * sku信息
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-16 16:28:06
 */
@TableName("pms_sku_info")
class SkuInfoEntity : Serializable {
    /**
     * skuId
     */
    @TableId
    var skuId: Long? = null

    /**
     * spuId
     */
    var spuId: Long? = null

    /**
     * sku名称
     */
    var skuName: String? = null

    /**
     * sku介绍描述
     */
    var skuDesc: String? = null

    /**
     * 所属分类id
     */
    var catalogId: Long? = null

    /**
     * 品牌id
     */
    var brandId: Long? = null

    /**
     * 默认图片
     */
    var skuDefaultImg: String? = null

    /**
     * 标题
     */
    var skuTitle: String? = null

    /**
     * 副标题
     */
    var skuSubtitle: String? = null

    /**
     * 价格
     */
    var price: BigDecimal? = null

    /**
     * 销量
     */
    var saleCount: Long? = null

    companion object {
        private const val serialVersionUID = 1L
    }
}