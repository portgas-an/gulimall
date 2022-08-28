package com.ace.gulimall.order.controller

import com.ace.gulimall.common.utils.R
import com.ace.gulimall.order.entity.RefundInfoEntity
import com.ace.gulimall.order.service.RefundInfoService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.util.*

/**
 * 退款信息
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-17 15:30:03
 */
@RestController
@RequestMapping("order/refundinfo")
class RefundInfoController {
    @Autowired
    private lateinit var refundInfoService: RefundInfoService

    /**
     * 列表
     */
    @RequestMapping("/list")
    fun list(@RequestParam params: Map<String?, Any?>?): R {
        val page = refundInfoService!!.queryPage(params)
        return R.ok().put("page", page) ?: R.error()
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    fun info(@PathVariable("id") id: Long?): R {
        val refundInfo = refundInfoService!!.getById(id)
        return R.ok().put("refundInfo", refundInfo) ?: R.error()
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    fun save(@RequestBody refundInfo: RefundInfoEntity): R {
        refundInfoService!!.save(refundInfo)
        return R.ok()
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    fun update(@RequestBody refundInfo: RefundInfoEntity): R {
        refundInfoService!!.updateById(refundInfo)
        return R.ok()
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    fun delete(@RequestBody ids: Array<Long?>): R {
        refundInfoService!!.removeByIds(Arrays.asList(*ids))
        return R.ok()
    }
}