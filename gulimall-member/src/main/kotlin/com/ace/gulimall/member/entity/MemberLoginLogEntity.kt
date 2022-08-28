package com.ace.gulimall.member.entity

import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableName
import java.io.Serializable
import java.util.*

/**
 * 会员登录记录
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-17 15:19:59
 */
@TableName("ums_member_login_log")
class MemberLoginLogEntity : Serializable {
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
     * 创建时间
     */
    private val createTime: Date? = null

    /**
     * ip
     */
    private val ip: String? = null

    /**
     * city
     */
    private val city: String? = null

    /**
     * 登录类型[1-web，2-app]
     */
    private val loginType: Int? = null

    companion object {
        private const val serialVersionUID = 1L
    }
}