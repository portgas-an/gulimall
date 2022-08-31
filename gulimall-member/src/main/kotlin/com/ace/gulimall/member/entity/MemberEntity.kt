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
     var id: Long? = null

    /**
     * 会员等级id
     */
     var levelId: Long? = null

    /**
     * 用户名
     */
     var username: String? = null

    /**
     * 密码
     */
     var password: String? = null

    /**
     * 昵称
     */
     var nickname: String? = null

    /**
     * 手机号码
     */
     var mobile: String? = null

    /**
     * 邮箱
     */
     var email: String? = null

    /**
     * 头像
     */
     var header: String? = null

    /**
     * 性别
     */
     var gender: Int? = null

    /**
     * 生日
     */
     var birth: Date? = null

    /**
     * 所在城市
     */
     var city: String? = null

    /**
     * 职业
     */
     var job: String? = null

    /**
     * 个性签名
     */
     var sign: String? = null

    /**
     * 用户来源
     */
     var sourceType: Int? = null

    /**
     * 积分
     */
     var integration: Int? = null

    /**
     * 成长值
     */
     var growth: Int? = null

    /**
     * 启用状态
     */
     var status: Int? = null

    /**
     * 注册时间
     */
     var createTime: Date? = null

    /**
     * 社交账号ID
     */
     var socialUid: String? = null

    /**
     * 社交账号Token
     */
     var accessToken: String? = null

    /**
     * 社交账号Token过期时间
     */
     var expiresIn: String? = null

    companion object {
        private const val serialVersionUID = 1L
    }
}