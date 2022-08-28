package com.ace.gulimall.order.entity

import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableName
import java.io.Serializable
import java.util.*

/**
 *
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-17 15:30:03
 */
@TableName("mq_message")
class MqMessageEntity : Serializable {
    /**
     *
     */
    @TableId
    var messageId: String? = null

    /**
     * JSON
     */
    var content: String? = null

    /**
     *
     */
    var toExchange: String? = null

    /**
     *
     */
    var classType: String? = null

    /**
     * 0-新建 1-已发送 2-错误抵达 3-已抵达
     */
    var messageStatus: Int? = null

    /**
     *
     */
    var createTime: Date? = null

    /**
     *
     */
    var updateTime: Date? = null

    companion object {
        private const val serialVersionUID = 1L
    }
}