package com.ace.gulimall.ware.entity

import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableName
import java.io.Serializable
import java.math.BigDecimal
import java.util.*

/**
 * 采购信息
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-17 15:34:08
 */
@TableName("wms_purchase")
class PurchaseEntity : Serializable {
    /**
     *
     */
    @TableId
    var id: Long? = null

    /**
     *
     */
    var assigneeId: Long? = null

    /**
     *
     */
    var assigneeName: String? = null

    /**
     *
     */
    var phone: String? = null

    /**
     *
     */
    var priority: Int? = null

    /**
     *
     */
    var status: Int? = null

    /**
     *
     */
    var wareId: Long? = null

    /**
     *
     */
    var amount: BigDecimal? = null

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