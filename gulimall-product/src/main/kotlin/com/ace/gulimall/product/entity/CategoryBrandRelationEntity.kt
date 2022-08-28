package com.ace.gulimall.product.entity

import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableName
import java.io.Serializable

/**
 * 品牌分类关联
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-16 16:28:06
 */
@TableName("pms_category_brand_relation")
class CategoryBrandRelationEntity : Serializable {
    /**
     *
     */
    @TableId
    private val id: Long? = null

    /**
     * 品牌id
     */
    var brandId: Long? = null

    /**
     * 分类id
     */
    var catelogId: Long? = null

    /**
     *
     */
    var brandName: String? = null

    /**
     *
     */
    var catelogName: String? = null

    companion object {
        private const val serialVersionUID = 1L
    }
}