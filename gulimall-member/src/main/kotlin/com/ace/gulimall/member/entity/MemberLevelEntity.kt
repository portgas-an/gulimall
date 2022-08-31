package com.ace.gulimall.member.entity

import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableName
import java.io.Serializable
import java.math.BigDecimal

/**
 * 会员等级
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-17 15:19:59
 */
@TableName("ums_member_level")
class MemberLevelEntity : Serializable {
    /**
     * id
     */
    @TableId
     var id: Long? = null

    /**
     * 等级名称
     */
     var name: String? = null

    /**
     * 等级需要的成长值
     */
     var growthPoint: Int? = null

    /**
     * 是否为默认等级[0->不是；1->是]
     */
     var defaultStatus: Int? = null

    /**
     * 免运费标准
     */
     var freeFreightPoint: BigDecimal? = null

    /**
     * 每次评价获取的成长值
     */
     var commentGrowthPoint: Int? = null

    /**
     * 是否有免邮特权
     */
     var priviledgeFreeFreight: Int? = null

    /**
     * 是否有会员价格特权
     */
     var priviledgeMemberPrice: Int? = null

    /**
     * 是否有生日特权
     */
     var priviledgeBirthday: Int? = null

    /**
     * 备注
     */
     var note: String? = null

    companion object {
        private const val serialVersionUID = 1L
    }
}