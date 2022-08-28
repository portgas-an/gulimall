package com.ace.gulimall.coupon.controller

import com.ace.gulimall.common.utils.R
import com.ace.gulimall.coupon.entity.SkuLadderEntity
import com.ace.gulimall.coupon.service.SkuLadderService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.util.*

/**
 * 商品阶梯价格
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-17 14:24:23
 */
@RestController
@RequestMapping("coupon/skuladder")
class SkuLadderController {
    @Autowired
    private lateinit var skuLadderService: SkuLadderService

    /**
     * 列表
     */
    @RequestMapping("/list")
    fun list(@RequestParam params: Map<String?, Any?>?): R {
        val page = skuLadderService.queryPage(params)
        return R.ok().put("page", page) ?: R.error()
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    fun info(@PathVariable("id") id: Long?): R {
        val skuLadder = skuLadderService.getById(id)
        return R.ok().put("skuLadder", skuLadder) ?: R.error()
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    fun save(@RequestBody skuLadder: SkuLadderEntity): R {
        skuLadderService.save(skuLadder)
        return R.ok()
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    fun update(@RequestBody skuLadder: SkuLadderEntity): R {
        skuLadderService.updateById(skuLadder)
        return R.ok()
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    fun delete(@RequestBody ids: Array<Long?>): R {
        skuLadderService.removeByIds(Arrays.asList(*ids))
        return R.ok()
    }
}