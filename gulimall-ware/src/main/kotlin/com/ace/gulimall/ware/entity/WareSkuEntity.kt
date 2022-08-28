package com.ace.gulimall.ware.entity

import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableName
import java.io.Serializable

/**
 * 商品库存
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-17 15:34:08
 */
@TableName("wms_ware_sku")
class WareSkuEntity : Serializable {
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
     * 仓库id
     */
    var wareId: Long? = null

    /**
     * 库存数
     */
    var stock: Int? = null

    /**
     * sku_name
     */
    var skuName: String? = null

    /**
     * 锁定库存
     */
    var stockLocked: Int? = null

    companion object {
        private const val serialVersionUID = 1L
    }
}