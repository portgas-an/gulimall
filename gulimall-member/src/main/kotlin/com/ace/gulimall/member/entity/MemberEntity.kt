package com.ace.gulimall.member.entity

import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableName
import java.io.Serializable
import java.util.*

/**
 * 会员
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-17 15:19:59
 */
@TableName("ums_member")
class MemberEntity : Serializable {
    /**
     * id
     */
    @TableId
    private val id: Long? = null

    /**
     * 会员等级id
     */
    private val levelId: Long? = null

    /**
     * 用户名
     */
    private val username: String? = null

    /**
     * 密码
     */
    private val password: String? = null

    /**
     * 昵称
     */
    private val nickname: String? = null

    /**
     * 手机号码
     */
    private val mobile: String? = null

    /**
     * 邮箱
     */
    private val email: String? = null

    /**
     * 头像
     */
    private val header: String? = null

    /**
     * 性别
     */
    private val gender: Int? = null

    /**
     * 生日
     */
    private val birth: Date? = null

    /**
     * 所在城市
     */
    private val city: String? = null

    /**
     * 职业
     */
    private val job: String? = null

    /**
     * 个性签名
     */
    private val sign: String? = null

    /**
     * 用户来源
     */
    private val sourceType: Int? = null

    /**
     * 积分
     */
    private val integration: Int? = null

    /**
     * 成长值
     */
    private val growth: Int? = null

    /**
     * 启用状态
     */
    private val status: Int? = null

    /**
     * 注册时间
     */
    private val createTime: Date? = null

    /**
     * 社交账号ID
     */
    private val socialUid: String? = null

    /**
     * 社交账号Token
     */
    private val accessToken: String? = null

    /**
     * 社交账号Token过期时间
     */
    private val expiresIn: String? = null

    companion object {
        private const val serialVersionUID = 1L
    }
}