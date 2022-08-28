package com.ace.gulimall.coupon.controller

import com.ace.gulimall.common.utils.R
import com.ace.gulimall.coupon.entity.SeckillSkuRelationEntity
import com.ace.gulimall.coupon.service.SeckillSkuRelationService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.util.*

/**
 * 秒杀活动商品关联
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-17 14:24:23
 */
@RestController
@RequestMapping("coupon/seckillskurelation")
class SeckillSkuRelationController {
    @Autowired
    private lateinit var seckillSkuRelationService: SeckillSkuRelationService

    /**
     * 列表
     */
    @RequestMapping("/list")
    fun list(@RequestParam params: Map<String?, Any?>?): R {
        val page = seckillSkuRelationService.queryPage(params)
        return R.ok().put("page", page) ?: R.error()
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    fun info(@PathVariable("id") id: Long?): R {
        val seckillSkuRelation = seckillSkuRelationService.getById(id)
        return R.ok().put("seckillSkuRelation", seckillSkuRelation) ?: R.error()
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    fun save(@RequestBody seckillSkuRelation: SeckillSkuRelationEntity): R {
        seckillSkuRelationService.save(seckillSkuRelation)
        return R.ok()
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    fun update(@RequestBody seckillSkuRelation: SeckillSkuRelationEntity): R {
        seckillSkuRelationService.updateById(seckillSkuRelation)
        return R.ok()
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    fun delete(@RequestBody ids: Array<Long?>): R {
        seckillSkuRelationService.removeByIds(Arrays.asList(*ids))
        return R.ok()
    }
}