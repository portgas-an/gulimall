package com.ace.gulimall.ware.entity

import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableName
import java.io.Serializable
import java.math.BigDecimal

/**
 *
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-17 15:34:08
 */
@TableName("wms_purchase_detail")
class PurchaseDetailEntity : Serializable {
    /**
     *
     */
    @TableId
    var id: Long? = null

    /**
     * 采购单id
     */
    var purchaseId: Long? = null

    /**
     * 采购商品id
     */
    var skuId: Long? = null

    /**
     * 采购数量
     */
    var skuNum: Int? = null

    /**
     * 采购金额
     */
    var skuPrice: BigDecimal? = null

    /**
     * 仓库id
     */
    var wareId: Long? = null

    /**
     * 状态[0新建，1已分配，2正在采购，3已完成，4采购失败]
     */
    var status: Int? = null

    companion object {
        private const val serialVersionUID = 1L
    }
}