package com.ace.gulimall.coupon.entity

import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableName
import java.io.Serializable
import java.util.*

/**
 * 秒杀活动场次
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-17 14:24:23
 */
@TableName("sms_seckill_session")
class SeckillSessionEntity : Serializable {
    /**
     * id
     */
    @TableId
    var id: Long? = null

    /**
     * 场次名称
     */
    var name: String? = null

    /**
     * 每日开始时间
     */
    var startTime: Date? = null

    /**
     * 每日结束时间
     */
    var endTime: Date? = null

    /**
     * 启用状态
     */
    var status: Int? = null

    /**
     * 创建时间
     */
    var createTime: Date? = null

    companion object {
        private const val serialVersionUID = 1L
    }
}