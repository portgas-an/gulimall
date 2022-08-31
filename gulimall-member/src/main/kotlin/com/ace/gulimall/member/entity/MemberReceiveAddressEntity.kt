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
     var id: Long? = null

    /**
     * member_id
     */
     var memberId: Long? = null

    /**
     * 收货人姓名
     */
     var name: String? = null

    /**
     * 电话
     */
     var phone: String? = null

    /**
     * 邮政编码
     */
     var postCode: String? = null

    /**
     * 省份/直辖市
     */
     var province: String? = null

    /**
     * 城市
     */
     var city: String? = null

    /**
     * 区
     */
     var region: String? = null

    /**
     * 详细地址(街道)
     */
     var detailAddress: String? = null

    /**
     * 省市区代码
     */
     var areacode: String? = null

    /**
     * 是否默认
     */
     var defaultStatus: Int? = null

    companion object {
         private const val serialVersionUID = 1L
    }
}