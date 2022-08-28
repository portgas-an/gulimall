package com.ace.gulimall.product.entity

import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableName
import java.io.Serializable

/**
 * sku图片
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-16 16:28:06
 */
@TableName("pms_sku_images")
class SkuImagesEntity : Serializable {
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
     * 图片地址
     */
    var imgUrl: String? = null

    /**
     * 排序
     */
    var imgSort: Int? = null

    /**
     * 默认图[0 - 不是默认图，1 - 是默认图]
     */
    var defaultImg: Int? = null

    companion object {
        private const val serialVersionUID = 1L
    }
}