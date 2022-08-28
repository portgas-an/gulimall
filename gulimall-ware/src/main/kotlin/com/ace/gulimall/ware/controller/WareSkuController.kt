package com.ace.gulimall.ware.controller

import com.ace.gulimall.common.utils.R
import com.ace.gulimall.ware.entity.WareSkuEntity
import com.ace.gulimall.ware.service.WareSkuService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.util.*

/**
 * 商品库存
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-17 15:34:08
 */
@RestController
@RequestMapping("ware/waresku")
class WareSkuController {
    @Autowired
    private lateinit var wareSkuService: WareSkuService

    /**
     * 列表
     */
    @RequestMapping("/list")
    fun list(@RequestParam params: Map<String?, Any?>?): R? {
        val page = wareSkuService!!.queryPage(params)
        return R.ok().put("page", page)
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    fun info(@PathVariable("id") id: Long?): R? {
        val wareSku = wareSkuService!!.getById(id)
        return R.ok().put("wareSku", wareSku)
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    fun save(@RequestBody wareSku: WareSkuEntity): R {
        wareSkuService!!.save(wareSku)
        return R.ok()
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    fun update(@RequestBody wareSku: WareSkuEntity): R {
        wareSkuService!!.updateById(wareSku)
        return R.ok()
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    fun delete(@RequestBody ids: Array<Long?>): R {
        wareSkuService!!.removeByIds(Arrays.asList(*ids))
        return R.ok()
    }
}