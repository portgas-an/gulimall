package com.ace.gulimall.order.controller

import com.ace.gulimall.common.utils.R
import com.ace.gulimall.order.entity.MqMessageEntity
import com.ace.gulimall.order.service.MqMessageService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.util.*

/**
 *
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-17 15:30:03
 */
@RestController
@RequestMapping("order/mqmessage")
class MqMessageController {
    @Autowired
    private lateinit var mqMessageService: MqMessageService

    /**
     * 列表
     */
    @RequestMapping("/list")
    fun list(@RequestParam params: Map<String?, Any?>?): R {
        val page = mqMessageService!!.queryPage(params)
        return R.ok().put("page", page) ?: R.error()
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{messageId}")
    fun info(@PathVariable("messageId") messageId: String?): R {
        val mqMessage = mqMessageService!!.getById(messageId)
        return R.ok().put("mqMessage", mqMessage) ?: R.error()
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    fun save(@RequestBody mqMessage: MqMessageEntity): R {
        mqMessageService!!.save(mqMessage)
        return R.ok()
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    fun update(@RequestBody mqMessage: MqMessageEntity): R {
        mqMessageService!!.updateById(mqMessage)
        return R.ok()
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    fun delete(@RequestBody messageIds: Array<String?>): R {
        mqMessageService!!.removeByIds(Arrays.asList(*messageIds))
        return R.ok()
    }
}