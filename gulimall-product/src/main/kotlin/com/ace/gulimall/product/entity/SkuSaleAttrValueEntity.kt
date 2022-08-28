package com.ace.gulimall.product.entity

import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableName
import java.io.Serializable

/**
 * sku销售属性&值
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-16 16:28:06
 */
@TableName("pms_sku_sale_attr_value")
class SkuSaleAttrValueEntity : Serializable {
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
     * attr_id
     */
    var attrId: Long? = null

    /**
     * 销售属性名
     */
    var attrName: String? = null

    /**
     * 销售属性值
     */
    var attrValue: String? = null

    /**
     * 顺序
     */
    var attrSort: Int? = null

    companion object {
        private const val serialVersionUID = 1L
    }
}