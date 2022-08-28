package com.ace.gulimall.product.entity

import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableName
import java.io.Serializable

/**
 * spu属性值
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-16 16:28:06
 */
@TableName("pms_product_attr_value")
class ProductAttrValueEntity : Serializable {
    /**
     * id
     */
    @TableId
    var id: Long? = null

    /**
     * 商品id
     */
    var spuId: Long? = null

    /**
     * 属性id
     */
    var attrId: Long? = null

    /**
     * 属性名
     */
    var attrName: String? = null

    /**
     * 属性值
     */
    var attrValue: String? = null

    /**
     * 顺序
     */
    var attrSort: Int? = null

    /**
     * 快速展示【是否展示在介绍上；0-否 1-是】
     */
    var quickShow: Int? = null

    companion object {
        private const val serialVersionUID = 1L
    }
}