package com.ace.gulimall.order.controller

import com.ace.gulimall.common.utils.R
import com.ace.gulimall.order.entity.OrderEntity
import com.ace.gulimall.order.service.OrderService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.util.*

/**
 * 订单
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-17 15:30:03
 */
@RestController
@RequestMapping("order/order")
class OrderController {
    @Autowired
    private lateinit var orderService: OrderService

    /**
     * 列表
     */
    @RequestMapping("/list")
    fun list(@RequestParam params: Map<String?, Any?>?): R {
        val page = orderService!!.queryPage(params)
        return R.ok().put("page", page) ?: R.error()
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    fun info(@PathVariable("id") id: Long?): R {
        val order = orderService!!.getById(id)
        return R.ok().put("order", order) ?: R.error()
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    fun save(@RequestBody order: OrderEntity): R {
        orderService!!.save(order)
        return R.ok()
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    fun update(@RequestBody order: OrderEntity): R {
        orderService!!.updateById(order)
        return R.ok()
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    fun delete(@RequestBody ids: Array<Long?>): R {
        orderService!!.removeByIds(Arrays.asList(*ids))
        return R.ok()
    }
}