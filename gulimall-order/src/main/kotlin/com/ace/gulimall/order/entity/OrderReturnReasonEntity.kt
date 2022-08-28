package com.ace.gulimall.order.entity

import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableName
import java.io.Serializable
import java.util.*

/**
 * 退货原因
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-17 15:30:03
 */
@TableName("oms_order_return_reason")
class OrderReturnReasonEntity : Serializable {
    /**
     * id
     */
    @TableId
    var id: Long? = null

    /**
     * 退货原因名
     */
    var name: String? = null

    /**
     * 排序
     */
    var sort: Int? = null

    /**
     * 启用状态
     */
    var status: Int? = null

    /**
     * create_time
     */
    var createTime: Date? = null

    companion object {
        private const val serialVersionUID = 1L
    }
}