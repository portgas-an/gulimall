package com.ace.gulimall.product.controller

import com.ace.gulimall.common.utils.R
import com.ace.gulimall.product.entity.SpuInfoEntity
import com.ace.gulimall.product.service.SpuInfoService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.util.*

/**
 * spu信息
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-16 17:43:10
 */
@RestController
@RequestMapping("product/spuinfo")
class SpuInfoController {
    @Autowired
    private lateinit var spuInfoService: SpuInfoService

    /**
     * 列表
     */
    @RequestMapping("/list")
    fun list(@RequestParam params: Map<String?, Any?>?): R {
        val page = spuInfoService!!.queryPage(params)
        return R.ok().put("page", page) ?: R.error()
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    fun info(@PathVariable("id") id: Long?): R {
        val spuInfo = spuInfoService!!.getById(id)
        return R.ok().put("spuInfo", spuInfo) ?: R.error()
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    fun save(@RequestBody spuInfo: SpuInfoEntity): R {
        spuInfoService!!.save(spuInfo)
        return R.ok()
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    fun update(@RequestBody spuInfo: SpuInfoEntity): R {
        spuInfoService!!.updateById(spuInfo)
        return R.ok()
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    fun delete(@RequestBody ids: Array<Long?>): R {
        spuInfoService!!.removeByIds(Arrays.asList(*ids))
        return R.ok()
    }
}