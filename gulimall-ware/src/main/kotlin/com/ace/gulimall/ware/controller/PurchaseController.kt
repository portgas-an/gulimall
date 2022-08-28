package com.ace.gulimall.ware.controller

import com.ace.gulimall.common.utils.R
import com.ace.gulimall.ware.entity.PurchaseEntity
import com.ace.gulimall.ware.service.PurchaseService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.util.*

/**
 * 采购信息
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-17 15:34:08
 */
@RestController
@RequestMapping("ware/purchase")
class PurchaseController {
    @Autowired
    private lateinit var purchaseService: PurchaseService

    /**
     * 列表
     */
    @RequestMapping("/list")
    fun list(@RequestParam params: Map<String?, Any?>?): R? {
        val page = purchaseService!!.queryPage(params)
        return R.ok().put("page", page)
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    fun info(@PathVariable("id") id: Long?): R? {
        val purchase = purchaseService!!.getById(id)
        return R.ok().put("purchase", purchase)
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    fun save(@RequestBody purchase: PurchaseEntity): R {
        purchaseService!!.save(purchase)
        return R.ok()
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    fun update(@RequestBody purchase: PurchaseEntity): R {
        purchaseService!!.updateById(purchase)
        return R.ok()
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    fun delete(@RequestBody ids: Array<Long?>): R {
        purchaseService!!.removeByIds(Arrays.asList(*ids))
        return R.ok()
    }
}