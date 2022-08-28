package com.ace.gulimall.product.controller

import com.ace.gulimall.common.utils.R
import com.ace.gulimall.product.entity.BrandEntity
import com.ace.gulimall.product.service.BrandService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.util.*

/**
 * 品牌
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-16 17:43:10
 */
@RestController
@RequestMapping("product/brand")
class BrandController {
    @Autowired
    private lateinit var brandService: BrandService

    /**
     * 列表
     */
    @RequestMapping("/list")
    fun list(@RequestParam params: Map<String?, Any?>?): R {
        val page = brandService!!.queryPage(params)
        return R.ok().put("page", page) ?: R.error()
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{brandId}")
    fun info(@PathVariable("brandId") brandId: Long?): R {
        val brand = brandService!!.getById(brandId)
        return R.ok().put("brand", brand) ?: R.error()
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    fun save(@RequestBody brand: BrandEntity): R {
        brandService!!.save(brand)
        return R.ok()
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    fun update(@RequestBody brand: BrandEntity): R {
        brandService!!.updateById(brand)
        return R.ok()
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    fun delete(@RequestBody brandIds: Array<Long?>): R {
        brandService!!.removeByIds(Arrays.asList(*brandIds))
        return R.ok()
    }
}