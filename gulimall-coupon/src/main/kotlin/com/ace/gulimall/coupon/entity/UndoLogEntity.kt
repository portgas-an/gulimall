package com.ace.gulimall.coupon.entity

import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableName
import java.io.Serializable
import java.util.*

/**
 *
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-17 14:24:23
 */
@TableName("undo_log")
class UndoLogEntity : Serializable {
    /**
     *
     */
    @TableId
    var id: Long? = null

    /**
     *
     */
    var branchId: Long? = null

    /**
     *
     */
    var xid: String? = null

    /**
     *
     */
    var context: String? = null

    /**
     *
     */
    var rollbackInfo: Byte = 0

    /**
     *
     */
    var logStatus: Int? = null

    /**
     *
     */
    var logCreated: Date? = null

    /**
     *
     */
    var logModified: Date? = null

    /**
     *
     */
    var ext: String? = null

    companion object {
        private const val serialVersionUID = 1L
    }
}