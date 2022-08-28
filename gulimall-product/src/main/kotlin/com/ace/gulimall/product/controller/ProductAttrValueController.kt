package com.ace.gulimall.product.controller

import com.ace.gulimall.common.utils.R
import com.ace.gulimall.product.entity.ProductAttrValueEntity
import com.ace.gulimall.product.service.ProductAttrValueService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.util.*

/**
 * spu属性值
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-16 17:43:10
 */
@RestController
@RequestMapping("product/productattrvalue")
class ProductAttrValueController {
    @Autowired
    private lateinit var productAttrValueService: ProductAttrValueService

    /**
     * 列表
     */
    @RequestMapping("/list")
    fun list(@RequestParam params: Map<String?, Any?>?): R {
        val page = productAttrValueService!!.queryPage(params)
        return R.ok().put("page", page) ?: R.error()
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    fun info(@PathVariable("id") id: Long?): R {
        val productAttrValue = productAttrValueService!!.getById(id)
        return R.ok().put("productAttrValue", productAttrValue) ?: R.error()
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    fun save(@RequestBody productAttrValue: ProductAttrValueEntity): R {
        productAttrValueService!!.save(productAttrValue)
        return R.ok()
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    fun update(@RequestBody productAttrValue: ProductAttrValueEntity): R {
        productAttrValueService!!.updateById(productAttrValue)
        return R.ok()
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    fun delete(@RequestBody ids: Array<Long?>): R {
        productAttrValueService!!.removeByIds(Arrays.asList(*ids))
        return R.ok()
    }
}