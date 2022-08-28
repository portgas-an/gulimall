package com.ace.gulimall.product.controller

import com.ace.gulimall.common.utils.R
import com.ace.gulimall.product.entity.SkuSaleAttrValueEntity
import com.ace.gulimall.product.service.SkuSaleAttrValueService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.util.*

/**
 * sku销售属性&值
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-16 17:43:10
 */
@RestController
@RequestMapping("product/skusaleattrvalue")
class SkuSaleAttrValueController {
    @Autowired
    private lateinit var skuSaleAttrValueService: SkuSaleAttrValueService

    /**
     * 列表
     */
    @RequestMapping("/list")
    fun list(@RequestParam params: Map<String?, Any?>?): R {
        val page = skuSaleAttrValueService!!.queryPage(params)
        return R.ok().put("page", page) ?: R.error()
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    fun info(@PathVariable("id") id: Long?): R {
        val skuSaleAttrValue = skuSaleAttrValueService!!.getById(id)
        return R.ok().put("skuSaleAttrValue", skuSaleAttrValue) ?: R.error()
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    fun save(@RequestBody skuSaleAttrValue: SkuSaleAttrValueEntity): R {
        skuSaleAttrValueService!!.save(skuSaleAttrValue)
        return R.ok()
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    fun update(@RequestBody skuSaleAttrValue: SkuSaleAttrValueEntity): R {
        skuSaleAttrValueService!!.updateById(skuSaleAttrValue)
        return R.ok()
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    fun delete(@RequestBody ids: Array<Long?>): R {
        skuSaleAttrValueService!!.removeByIds(Arrays.asList(*ids))
        return R.ok()
    }
}