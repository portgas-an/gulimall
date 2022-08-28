package com.ace.gulimall.product.controller

import com.ace.gulimall.common.utils.R
import com.ace.gulimall.product.entity.SpuImagesEntity
import com.ace.gulimall.product.service.SpuImagesService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.util.*

/**
 * spu图片
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-16 17:43:10
 */
@RestController
@RequestMapping("product/spuimages")
class SpuImagesController {
    @Autowired
    private lateinit var spuImagesService: SpuImagesService

    /**
     * 列表
     */
    @RequestMapping("/list")
    fun list(@RequestParam params: Map<String?, Any?>?): R {
        val page = spuImagesService!!.queryPage(params)
        return R.ok().put("page", page) ?: R.error()
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    fun info(@PathVariable("id") id: Long?): R {
        val spuImages = spuImagesService!!.getById(id)
        return R.ok().put("spuImages", spuImages) ?: R.error()
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    fun save(@RequestBody spuImages: SpuImagesEntity): R {
        spuImagesService!!.save(spuImages)
        return R.ok()
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    fun update(@RequestBody spuImages: SpuImagesEntity): R {
        spuImagesService!!.updateById(spuImages)
        return R.ok()
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    fun delete(@RequestBody ids: Array<Long?>): R {
        spuImagesService!!.removeByIds(Arrays.asList(*ids))
        return R.ok()
    }
}