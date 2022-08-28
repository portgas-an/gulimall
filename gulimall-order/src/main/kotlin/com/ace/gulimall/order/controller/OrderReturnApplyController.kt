package com.ace.gulimall.order.controller

import com.ace.gulimall.common.utils.R
import com.ace.gulimall.order.entity.OrderReturnApplyEntity
import com.ace.gulimall.order.service.OrderReturnApplyService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.util.*

/**
 * 订单退货申请
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-17 15:30:03
 */
@RestController
@RequestMapping("order/orderreturnapply")
class OrderReturnApplyController {
    @Autowired
    private lateinit var orderReturnApplyService: OrderReturnApplyService

    /**
     * 列表
     */
    @RequestMapping("/list")
    fun list(@RequestParam params: Map<String?, Any?>?): R {
        val page = orderReturnApplyService!!.queryPage(params)
        return R.ok().put("page", page) ?: R.error()
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    fun info(@PathVariable("id") id: Long?): R {
        val orderReturnApply = orderReturnApplyService!!.getById(id)
        return R.ok().put("orderReturnApply", orderReturnApply) ?: R.error()
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    fun save(@RequestBody orderReturnApply: OrderReturnApplyEntity): R {
        orderReturnApplyService!!.save(orderReturnApply)
        return R.ok()
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    fun update(@RequestBody orderReturnApply: OrderReturnApplyEntity): R {
        orderReturnApplyService!!.updateById(orderReturnApply)
        return R.ok()
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    fun delete(@RequestBody ids: Array<Long?>): R {
        orderReturnApplyService!!.removeByIds(Arrays.asList(*ids))
        return R.ok()
    }
}