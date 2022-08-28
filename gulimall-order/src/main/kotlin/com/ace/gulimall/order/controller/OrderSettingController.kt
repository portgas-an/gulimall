package com.ace.gulimall.order.controller

import com.ace.gulimall.common.utils.R
import com.ace.gulimall.order.entity.OrderSettingEntity
import com.ace.gulimall.order.service.OrderSettingService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.util.*

/**
 * 订单配置信息
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-17 15:30:03
 */
@RestController
@RequestMapping("order/ordersetting")
class OrderSettingController {
    @Autowired
    private lateinit var orderSettingService: OrderSettingService

    /**
     * 列表
     */
    @RequestMapping("/list")
    fun list(@RequestParam params: Map<String?, Any?>?): R {
        val page = orderSettingService!!.queryPage(params)
        return R.ok().put("page", page) ?: R.error()
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    fun info(@PathVariable("id") id: Long?): R {
        val orderSetting = orderSettingService!!.getById(id)
        return R.ok().put("orderSetting", orderSetting) ?: R.error()
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    fun save(@RequestBody orderSetting: OrderSettingEntity): R {
        orderSettingService!!.save(orderSetting)
        return R.ok()
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    fun update(@RequestBody orderSetting: OrderSettingEntity): R {
        orderSettingService!!.updateById(orderSetting)
        return R.ok()
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    fun delete(@RequestBody ids: Array<Long?>): R {
        orderSettingService!!.removeByIds(Arrays.asList(*ids))
        return R.ok()
    }
}