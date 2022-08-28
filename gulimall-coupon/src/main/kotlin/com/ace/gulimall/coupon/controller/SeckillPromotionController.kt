package com.ace.gulimall.coupon.controller

import com.ace.gulimall.coupon.entity.SeckillPromotionEntity
import com.ace.gulimall.coupon.service.SeckillPromotionService
import com.ace.gulimall.common.utils.R
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.util.*

/**
 * 秒杀活动
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-17 14:24:23
 */
@RestController
@RequestMapping("coupon/seckillpromotion")
class SeckillPromotionController {
    @Autowired
    private lateinit var seckillPromotionService: SeckillPromotionService

    /**
     * 列表
     */
    @RequestMapping("/list")
    fun list(@RequestParam params: Map<String?, Any?>?): R {
        val page = seckillPromotionService.queryPage(params)
        return R.ok().put("page", page) ?: R.error()
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    fun info(@PathVariable("id") id: Long?): R {
        val seckillPromotion = seckillPromotionService.getById(id)
        return R.ok().put("seckillPromotion", seckillPromotion) ?: R.error()
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    fun save(@RequestBody seckillPromotion: SeckillPromotionEntity): R {
        seckillPromotionService.save(seckillPromotion)
        return R.ok()
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    fun update(@RequestBody seckillPromotion: SeckillPromotionEntity): R {
        seckillPromotionService.updateById(seckillPromotion)
        return R.ok()
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    fun delete(@RequestBody ids: Array<Long?>): R {
        seckillPromotionService.removeByIds(Arrays.asList(*ids))
        return R.ok()
    }
}