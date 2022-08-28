package com.ace.gulimall.order.entity

import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableName
import java.io.Serializable
import java.util.*

/**
 * 订单操作历史记录
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-17 15:30:03
 */
@TableName("oms_order_operate_history")
class OrderOperateHistoryEntity : Serializable {
    /**
     * id
     */
    @TableId
    var id: Long? = null

    /**
     * 订单id
     */
    var orderId: Long? = null

    /**
     * 操作人[用户；系统；后台管理员]
     */
    var operateMan: String? = null

    /**
     * 操作时间
     */
    var createTime: Date? = null

    /**
     * 订单状态【0->待付款；1->待发货；2->已发货；3->已完成；4->已关闭；5->无效订单】
     */
    var orderStatus: Int? = null

    /**
     * 备注
     */
    var note: String? = null

    companion object {
        private const val serialVersionUID = 1L
    }
}