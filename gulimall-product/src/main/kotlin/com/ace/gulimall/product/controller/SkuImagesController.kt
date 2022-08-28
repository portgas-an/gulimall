package com.ace.gulimall.product.controller

import com.ace.gulimall.common.utils.R
import com.ace.gulimall.product.entity.SkuImagesEntity
import com.ace.gulimall.product.service.SkuImagesService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.util.*

/**
 * sku图片
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-16 17:43:10
 */
@RestController
@RequestMapping("product/skuimages")
class SkuImagesController {
    @Autowired
    private lateinit var skuImagesService: SkuImagesService

    /**
     * 列表
     */
    @RequestMapping("/list")
    fun list(@RequestParam params: Map<String?, Any?>?): R {
        val page = skuImagesService!!.queryPage(params)
        return R.ok().put("page", page) ?: R.error()
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    fun info(@PathVariable("id") id: Long?): R {
        val skuImages = skuImagesService!!.getById(id)
        return R.ok().put("skuImages", skuImages) ?: R.error()
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    fun save(@RequestBody skuImages: SkuImagesEntity): R {
        skuImagesService!!.save(skuImages)
        return R.ok()
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    fun update(@RequestBody skuImages: SkuImagesEntity): R {
        skuImagesService!!.updateById(skuImages)
        return R.ok()
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    fun delete(@RequestBody ids: Array<Long?>): R {
        skuImagesService!!.removeByIds(Arrays.asList(*ids))
        return R.ok()
    }
}