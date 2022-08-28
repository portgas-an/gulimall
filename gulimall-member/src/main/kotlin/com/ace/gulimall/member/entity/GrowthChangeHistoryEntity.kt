package com.ace.gulimall.member.entity

import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableName
import java.io.Serializable
import java.util.*

/**
 * 成长值变化历史记录
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-17 15:19:59
 */
@TableName("ums_growth_change_history")
class GrowthChangeHistoryEntity : Serializable {
    /**
     * id
     */
    @TableId
    private val id: Long? = null

    /**
     * member_id
     */
    private val memberId: Long? = null

    /**
     * create_time
     */
    private val createTime: Date? = null

    /**
     * 改变的值（正负计数）
     */
    private val changeCount: Int? = null

    /**
     * 备注
     */
    private val note: String? = null

    /**
     * 积分来源[0-购物，1-管理员修改]
     */
    private val sourceType: Int? = null

    companion object {
        private const val serialVersionUID = 1L
    }
}