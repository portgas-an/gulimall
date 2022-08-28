package com.ace.gulimall.coupon.entity

import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableName
import java.io.Serializable
import java.util.*

/**
 * 秒杀活动
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-17 14:24:23
 */
@TableName("sms_seckill_promotion")
class SeckillPromotionEntity : Serializable {
    /**
     * id
     */
    @TableId
   var id: Long? = null

    /**
     * 活动标题
     */
   var title: String? = null

    /**
     * 开始日期
     */
   var startTime: Date? = null

    /**
     * 结束日期
     */
   var endTime: Date? = null

    /**
     * 上下线状态
     */
   var status: Int? = null

    /**
     * 创建时间
     */
   var createTime: Date? = null

    /**
     * 创建人
     */
   var userId: Long? = null

    companion object {
        private const val serialVersionUID = 1L
    }
}