package com.ace.gulimall.product.controller

import com.ace.gulimall.common.utils.R
import com.ace.gulimall.product.entity.SkuInfoEntity
import com.ace.gulimall.product.service.SkuInfoService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.util.*

/**
 * sku信息
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-16 17:43:10
 */
@RestController
@RequestMapping("product/skuinfo")
class SkuInfoController {
    @Autowired
    private lateinit var skuInfoService: SkuInfoService

    /**
     * 列表
     */
    @RequestMapping("/list")
    fun list(@RequestParam params: Map<String?, Any?>?): R {
        val page = skuInfoService!!.queryPage(params)
        return R.ok().put("page", page) ?: R.error()
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{skuId}")
    fun info(@PathVariable("skuId") skuId: Long?): R {
        val skuInfo = skuInfoService!!.getById(skuId)
        return R.ok().put("skuInfo", skuInfo) ?: R.error()
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    fun save(@RequestBody skuInfo: SkuInfoEntity): R {
        skuInfoService!!.save(skuInfo)
        return R.ok()
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    fun update(@RequestBody skuInfo: SkuInfoEntity): R {
        skuInfoService!!.updateById(skuInfo)
        return R.ok()
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    fun delete(@RequestBody skuIds: Array<Long?>): R {
        skuInfoService!!.removeByIds(Arrays.asList(*skuIds))
        return R.ok()
    }
}