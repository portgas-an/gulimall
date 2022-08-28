package com.ace.gulimall.coupon.controller

import com.ace.gulimall.common.utils.R
import com.ace.gulimall.coupon.entity.SkuFullReductionEntity
import com.ace.gulimall.coupon.service.SkuFullReductionService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.util.*

/**
 * 商品满减信息
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-17 14:24:23
 */
@RestController
@RequestMapping("coupon/skufullreduction")
class SkuFullReductionController {
    @Autowired
    private lateinit var skuFullReductionService: SkuFullReductionService

    /**
     * 列表
     */
    @RequestMapping("/list")
    fun list(@RequestParam params: Map<String?, Any?>?): R {
        val page = skuFullReductionService.queryPage(params)
        return R.ok().put("page", page) ?: R.error()
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    fun info(@PathVariable("id") id: Long?): R {
        val skuFullReduction = skuFullReductionService.getById(id)
        return R.ok().put("skuFullReduction", skuFullReduction) ?: R.error()
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    fun save(@RequestBody skuFullReduction: SkuFullReductionEntity): R {
        skuFullReductionService.save(skuFullReduction)
        return R.ok()
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    fun update(@RequestBody skuFullReduction: SkuFullReductionEntity): R {
        skuFullReductionService.updateById(skuFullReduction)
        return R.ok()
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    fun delete(@RequestBody ids: Array<Long?>): R {
        skuFullReductionService.removeByIds(Arrays.asList(*ids))
        return R.ok()
    }
}