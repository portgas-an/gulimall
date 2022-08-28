package com.ace.gulimall.order.controller

import com.ace.gulimall.common.utils.R
import com.ace.gulimall.order.entity.OrderOperateHistoryEntity
import com.ace.gulimall.order.service.OrderOperateHistoryService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.util.*

/**
 * 订单操作历史记录
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-17 15:30:03
 */
@RestController
@RequestMapping("order/orderoperatehistory")
class OrderOperateHistoryController {
    @Autowired
    private lateinit var orderOperateHistoryService: OrderOperateHistoryService

    /**
     * 列表
     */
    @RequestMapping("/list")
    fun list(@RequestParam params: Map<String?, Any?>?): R {
        val page = orderOperateHistoryService!!.queryPage(params)
        return R.ok().put("page", page) ?: R.error()
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    fun info(@PathVariable("id") id: Long?): R {
        val orderOperateHistory = orderOperateHistoryService!!.getById(id)
        return R.ok().put("orderOperateHistory", orderOperateHistory) ?: R.error()
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    fun save(@RequestBody orderOperateHistory: OrderOperateHistoryEntity): R {
        orderOperateHistoryService!!.save(orderOperateHistory)
        return R.ok()
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    fun update(@RequestBody orderOperateHistory: OrderOperateHistoryEntity): R {
        orderOperateHistoryService!!.updateById(orderOperateHistory)
        return R.ok()
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    fun delete(@RequestBody ids: Array<Long?>): R {
        orderOperateHistoryService!!.removeByIds(Arrays.asList(*ids))
        return R.ok()
    }
}