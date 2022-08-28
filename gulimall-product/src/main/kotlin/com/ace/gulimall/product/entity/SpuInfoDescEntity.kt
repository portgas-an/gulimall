package com.ace.gulimall.product.entity

import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableName
import java.io.Serializable

/**
 * spu信息介绍
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-16 16:28:06
 */
@TableName("pms_spu_info_desc")
class SpuInfoDescEntity : Serializable {
    /**
     * 商品id
     */
    @TableId
    var spuId: Long? = null

    /**
     * 商品介绍
     */
    var decript: String? = null

    companion object {
        private const val serialVersionUID = 1L
    }
}