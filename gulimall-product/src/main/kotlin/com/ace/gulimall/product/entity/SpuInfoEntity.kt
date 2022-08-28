package com.ace.gulimall.product.entity

import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableName
import java.io.Serializable
import java.math.BigDecimal
import java.util.*

/**
 * spu信息
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-16 16:28:06
 */
@TableName("pms_spu_info")
class SpuInfoEntity : Serializable {
    /**
     * 商品id
     */
    @TableId
    var id: Long? = null

    /**
     * 商品名称
     */
    var spuName: String? = null

    /**
     * 商品描述
     */
    var spuDescription: String? = null

    /**
     * 所属分类id
     */
    var catalogId: Long? = null

    /**
     * 品牌id
     */
    var brandId: Long? = null

    /**
     *
     */
    var weight: BigDecimal? = null

    /**
     * 上架状态[0 - 下架，1 - 上架]
     */
    var publishStatus: Int? = null

    /**
     *
     */
    var createTime: Date? = null

    /**
     *
     */
    var updateTime: Date? = null

    companion object {
        private const val serialVersionUID = 1L
    }
}