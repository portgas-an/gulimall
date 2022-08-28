package com.ace.gulimall.product.controller

import com.ace.gulimall.common.utils.R
import com.ace.gulimall.product.entity.SpuInfoDescEntity
import com.ace.gulimall.product.service.SpuInfoDescService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.util.*

/**
 * spu信息介绍
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-16 17:43:10
 */
@RestController
@RequestMapping("product/spuinfodesc")
class SpuInfoDescController {
    @Autowired
    private lateinit var spuInfoDescService: SpuInfoDescService

    /**
     * 列表
     */
    @RequestMapping("/list")
    fun list(@RequestParam params: Map<String?, Any?>?): R {
        val page = spuInfoDescService!!.queryPage(params)
        return R.ok().put("page", page) ?: R.error()
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{spuId}")
    fun info(@PathVariable("spuId") spuId: Long?): R {
        val spuInfoDesc = spuInfoDescService!!.getById(spuId)
        return R.ok().put("spuInfoDesc", spuInfoDesc) ?: R.error()
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    fun save(@RequestBody spuInfoDesc: SpuInfoDescEntity): R {
        spuInfoDescService!!.save(spuInfoDesc)
        return R.ok()
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    fun update(@RequestBody spuInfoDesc: SpuInfoDescEntity): R {
        spuInfoDescService!!.updateById(spuInfoDesc)
        return R.ok()
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    fun delete(@RequestBody spuIds: Array<Long?>): R {
        spuInfoDescService!!.removeByIds(Arrays.asList(*spuIds))
        return R.ok()
    }
}