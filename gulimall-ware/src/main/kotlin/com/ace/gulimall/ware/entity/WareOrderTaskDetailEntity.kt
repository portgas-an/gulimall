package com.ace.gulimall.ware.entity

import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableName
import java.io.Serializable

/**
 * 库存工作单
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-17 15:34:08
 */
@TableName("wms_ware_order_task_detail")
class WareOrderTaskDetailEntity : Serializable {
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
     * sku_name
     */
    var skuName: String? = null

    /**
     * 购买个数
     */
    var skuNum: Int? = null

    /**
     * 工作单id
     */
    var taskId: Long? = null

    /**
     * 仓库id
     */
    var wareId: Long? = null

    /**
     * 1-已锁定  2-已解锁  3-扣减
     */
    var lockStatus: Int? = null

    companion object {
        private const val serialVersionUID = 1L
    }
}