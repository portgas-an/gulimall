package com.ace.gulimall.member.entity

import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableName
import java.io.Serializable
import java.util.*

/**
 * 积分变化历史记录
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-17 15:19:59
 */
@TableName("ums_integration_change_history")
class IntegrationChangeHistoryEntity : Serializable {
    /**
     * id
     */
    @TableId
     var id: Long? = null

    /**
     * member_id
     */
     var memberId: Long? = null

    /**
     * create_time
     */
     var createTime: Date? = null

    /**
     * 变化的值
     */
     var changeCount: Int? = null

    /**
     * 备注
     */
     var note: String? = null

    /**
     * 来源[0->购物；1->管理员修改;2->活动]
     */
     var sourceTyoe: Int? = null

    companion object {
        private const val serialVersionUID = 1L
    }
}