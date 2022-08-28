package com.ace.gulimall.order.controller

import com.ace.gulimall.common.utils.R
import com.ace.gulimall.order.entity.OrderItemEntity
import com.ace.gulimall.order.service.OrderItemService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.util.*

/**
 * 订单项信息
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-17 15:30:03
 */
@RestController
@RequestMapping("order/orderitem")
class OrderItemController {
    @Autowired
    private lateinit var orderItemService: OrderItemService

    /**
     * 列表
     */
    @RequestMapping("/list")
    fun list(@RequestParam params: Map<String?, Any?>?): R {
        val page = orderItemService!!.queryPage(params)
        return R.ok().put("page", page) ?: R.error()
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    fun info(@PathVariable("id") id: Long?): R {
        val orderItem = orderItemService!!.getById(id)
        return R.ok().put("orderItem", orderItem) ?: R.error()
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    fun save(@RequestBody orderItem: OrderItemEntity): R {
        orderItemService!!.save(orderItem)
        return R.ok()
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    fun update(@RequestBody orderItem: OrderItemEntity): R {
        orderItemService!!.updateById(orderItem)
        return R.ok()
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    fun delete(@RequestBody ids: Array<Long?>): R {
        orderItemService!!.removeByIds(Arrays.asList(*ids))
        return R.ok()
    }
}