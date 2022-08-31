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
     var id: Long? = null

    /**
     * member_id
     */
     var memberId: Long? = null

    /**
     * 创建时间
     */
     var createTime: Date? = null

    /**
     * ip
     */
     var ip: String? = null

    /**
     * city
     */
     var city: String? = null

    /**
     * 登录类型[1-web，2-app]
     */
     var loginType: Int? = null

    companion object {
        private const val serialVersionUID = 1L
    }
}