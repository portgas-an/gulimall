package com.ace.gulimall.coupon.controller

import com.ace.gulimall.common.utils.R
import com.ace.gulimall.coupon.entity.SpuBoundsEntity
import com.ace.gulimall.coupon.service.SpuBoundsService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.util.*

/**
 * 商品spu积分设置
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-17 14:24:23
 */
@RestController
@RequestMapping("coupon/spubounds")
class SpuBoundsController {
    @Autowired
    private lateinit var spuBoundsService: SpuBoundsService

    /**
     * 列表
     */
    @RequestMapping("/list")
    fun list(@RequestParam params: Map<String?, Any?>?): R {
        val page = spuBoundsService.queryPage(params)
        return R.ok().put("page", page) ?: R.error()
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    fun info(@PathVariable("id") id: Long?): R {
        val spuBounds = spuBoundsService.getById(id)
        return R.ok().put("spuBounds", spuBounds) ?: R.error()
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    fun save(@RequestBody spuBounds: SpuBoundsEntity): R {
        spuBoundsService.save(spuBounds)
        return R.ok()
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    fun update(@RequestBody spuBounds: SpuBoundsEntity): R {
        spuBoundsService.updateById(spuBounds)
        return R.ok()
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    fun delete(@RequestBody ids: Array<Long?>): R {
        spuBoundsService.removeByIds(Arrays.asList(*ids))
        return R.ok()
    }
}