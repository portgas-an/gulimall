package com.ace.gulimall.order.controller

import com.ace.gulimall.common.utils.R
import com.ace.gulimall.order.entity.OrderReturnReasonEntity
import com.ace.gulimall.order.service.OrderReturnReasonService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.util.*

/**
 * 退货原因
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-17 15:30:03
 */
@RestController
@RequestMapping("order/orderreturnreason")
class OrderReturnReasonController {
    @Autowired
    private lateinit var orderReturnReasonService: OrderReturnReasonService

    /**
     * 列表
     */
    @RequestMapping("/list")
    fun list(@RequestParam params: Map<String?, Any?>?): R {
        val page = orderReturnReasonService!!.queryPage(params)
        return R.ok().put("page", page) ?: R.error()
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    fun info(@PathVariable("id") id: Long?): R {
        val orderReturnReason = orderReturnReasonService!!.getById(id)
        return R.ok().put("orderReturnReason", orderReturnReason) ?: R.error()
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    fun save(@RequestBody orderReturnReason: OrderReturnReasonEntity): R {
        orderReturnReasonService!!.save(orderReturnReason)
        return R.ok()
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    fun update(@RequestBody orderReturnReason: OrderReturnReasonEntity): R {
        orderReturnReasonService!!.updateById(orderReturnReason)
        return R.ok()
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    fun delete(@RequestBody ids: Array<Long?>): R {
        orderReturnReasonService!!.removeByIds(Arrays.asList(*ids))
        return R.ok()
    }
}