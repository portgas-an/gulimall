package com.ace.gulimall.member.entity

import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableName
import java.io.Serializable
import java.math.BigDecimal

/**
 * 会员统计信息
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-17 15:19:59
 */
@TableName("ums_member_statistics_info")
class MemberStatisticsInfoEntity : Serializable {
    /**
     * id
     */
    @TableId
    private val id: Long? = null

    /**
     * 会员id
     */
    private val memberId: Long? = null

    /**
     * 累计消费金额
     */
    private val consumeAmount: BigDecimal? = null

    /**
     * 累计优惠金额
     */
    private val couponAmount: BigDecimal? = null

    /**
     * 订单数量
     */
    private val orderCount: Int? = null

    /**
     * 优惠券数量
     */
    private val couponCount: Int? = null

    /**
     * 评价数
     */
    private val commentCount: Int? = null

    /**
     * 退货数量
     */
    private val returnOrderCount: Int? = null

    /**
     * 登录次数
     */
    private val loginCount: Int? = null

    /**
     * 关注数量
     */
    private val attendCount: Int? = null

    /**
     * 粉丝数量
     */
    private val fansCount: Int? = null

    /**
     * 收藏的商品数量
     */
    private val collectProductCount: Int? = null

    /**
     * 收藏的专题活动数量
     */
    private val collectSubjectCount: Int? = null

    /**
     * 收藏的评论数量
     */
    private val collectCommentCount: Int? = null

    /**
     * 邀请的朋友数量
     */
    private val inviteFriendCount: Int? = null

    companion object {
        private const val serialVersionUID = 1L
    }
}