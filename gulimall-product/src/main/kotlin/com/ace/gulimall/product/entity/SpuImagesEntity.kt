package com.ace.gulimall.product.entity

import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableName
import java.io.Serializable

/**
 * spu图片
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-16 16:28:06
 */
@TableName("pms_spu_images")
class SpuImagesEntity : Serializable {
    /**
     * id
     */
    @TableId
    var id: Long? = null

    /**
     * spu_id
     */
    var spuId: Long? = null

    /**
     * 图片名
     */
    var imgName: String? = null

    /**
     * 图片地址
     */
    var imgUrl: String? = null

    /**
     * 顺序
     */
    var imgSort: Int? = null

    /**
     * 是否默认图
     */
    var defaultImg: Int? = null

    companion object {
        private const val serialVersionUID = 1L
    }
}