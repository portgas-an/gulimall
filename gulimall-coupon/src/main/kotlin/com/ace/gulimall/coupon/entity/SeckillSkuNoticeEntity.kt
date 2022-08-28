package com.ace.gulimall.coupon.entity

import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableName
import java.io.Serializable
import java.util.*

/**
 * 秒杀商品通知订阅
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-17 14:24:23
 */
@TableName("sms_seckill_sku_notice")
class SeckillSkuNoticeEntity : Serializable {
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
     * sku_id
     */
    var skuId: Long? = null

    /**
     * 活动场次id
     */
    var sessionId: Long? = null

    /**
     * 订阅时间
     */
    var subcribeTime: Date? = null

    /**
     * 发送时间
     */
    var sendTime: Date? = null

    /**
     * 通知方式[0-短信，1-邮件]
     */
    var noticeType: Int? = null

    companion object {
        private const val serialVersionUID = 1L
    }
}