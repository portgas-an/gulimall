package com.ace.gulimall.member.entity

import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableName
import java.io.Serializable
import java.util.*

/**
 *
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-17 15:19:59
 */
@TableName("undo_log")
class UndoLogEntity : Serializable {
    /**
     *
     */
    @TableId
    private val id: Long? = null

    /**
     *
     */
    private val branchId: Long? = null

    /**
     *
     */
    private val xid: String? = null

    /**
     *
     */
    private val context: String? = null

    /**
     *
     */
    private val rollbackInfo: Byte = 0

    /**
     *
     */
    private val logStatus: Int? = null

    /**
     *
     */
    private val logCreated: Date? = null

    /**
     *
     */
    private val logModified: Date? = null

    /**
     *
     */
    private val ext: String? = null

    companion object {
        private const val serialVersionUID = 1L
    }
}