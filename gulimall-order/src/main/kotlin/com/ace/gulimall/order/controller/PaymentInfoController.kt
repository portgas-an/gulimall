package com.ace.gulimall.order.controller

import com.ace.gulimall.common.utils.R
import com.ace.gulimall.order.entity.PaymentInfoEntity
import com.ace.gulimall.order.service.PaymentInfoService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.util.*

/**
 * 支付信息表
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-17 15:30:03
 */
@RestController
@RequestMapping("order/paymentinfo")
class PaymentInfoController {
    @Autowired
    private lateinit var paymentInfoService: PaymentInfoService

    /**
     * 列表
     */
    @RequestMapping("/list")
    fun list(@RequestParam params: Map<String?, Any?>?): R {
        val page = paymentInfoService!!.queryPage(params)
        return R.ok().put("page", page) ?: R.error()
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    fun info(@PathVariable("id") id: Long?): R {
        val paymentInfo = paymentInfoService!!.getById(id)
        return R.ok().put("paymentInfo", paymentInfo) ?: R.error()
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    fun save(@RequestBody paymentInfo: PaymentInfoEntity): R {
        paymentInfoService!!.save(paymentInfo)
        return R.ok()
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    fun update(@RequestBody paymentInfo: PaymentInfoEntity): R {
        paymentInfoService!!.updateById(paymentInfo)
        return R.ok()
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    fun delete(@RequestBody ids: Array<Long?>): R {
        paymentInfoService!!.removeByIds(Arrays.asList(*ids))
        return R.ok()
    }
}