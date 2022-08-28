package com.ace.gulimall.member.entity

import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableName
import java.io.Serializable

/**
 * 会员收货地址
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-17 15:19:59
 */
@TableName("ums_member_receive_address")
class MemberReceiveAddressEntity : Serializable {
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
     * 收货人姓名
     */
    private val name: String? = null

    /**
     * 电话
     */
    private val phone: String? = null

    /**
     * 邮政编码
     */
    private val postCode: String? = null

    /**
     * 省份/直辖市
     */
    private val province: String? = null

    /**
     * 城市
     */
    private val city: String? = null

    /**
     * 区
     */
    private val region: String? = null

    /**
     * 详细地址(街道)
     */
    private val detailAddress: String? = null

    /**
     * 省市区代码
     */
    private val areacode: String? = null

    /**
     * 是否默认
     */
    private val defaultStatus: Int? = null

    companion object {
        private const val serialVersionUID = 1L
    }
}