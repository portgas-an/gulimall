package com.ace.gulimall.ware.controller

import com.ace.gulimall.common.utils.R
import com.ace.gulimall.ware.entity.PurchaseDetailEntity
import com.ace.gulimall.ware.service.PurchaseDetailService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.util.*

/**
 *
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-17 15:34:08
 */
@RestController
@RequestMapping("ware/purchasedetail")
class PurchaseDetailController {
    @Autowired
    private lateinit var purchaseDetailService: PurchaseDetailService

    /**
     * 列表
     */
    @RequestMapping("/list")
    fun list(@RequestParam params: Map<String?, Any?>?): R? {
        val page = purchaseDetailService!!.queryPage(params)
        return R.ok().put("page", page)
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    fun info(@PathVariable("id") id: Long?): R? {
        val purchaseDetail = purchaseDetailService!!.getById(id)
        return R.ok().put("purchaseDetail", purchaseDetail)
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    fun save(@RequestBody purchaseDetail: PurchaseDetailEntity): R {
        purchaseDetailService!!.save(purchaseDetail)
        return R.ok()
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    fun update(@RequestBody purchaseDetail: PurchaseDetailEntity): R {
        purchaseDetailService!!.updateById(purchaseDetail)
        return R.ok()
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    fun delete(@RequestBody ids: Array<Long?>): R {
        purchaseDetailService!!.removeByIds(Arrays.asList(*ids))
        return R.ok()
    }
}