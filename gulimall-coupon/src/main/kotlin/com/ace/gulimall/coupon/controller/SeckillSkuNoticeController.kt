package com.ace.gulimall.coupon.controller

import com.ace.gulimall.coupon.entity.SeckillSkuNoticeEntity
import com.ace.gulimall.coupon.service.SeckillSkuNoticeService
import com.ace.gulimall.common.utils.R
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.util.*

/**
 * 秒杀商品通知订阅
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-17 14:24:23
 */
@RestController
@RequestMapping("coupon/seckillskunotice")
class SeckillSkuNoticeController {
    @Autowired
    private lateinit var seckillSkuNoticeService: SeckillSkuNoticeService

    /**
     * 列表
     */
    @RequestMapping("/list")
    fun list(@RequestParam params: Map<String?, Any?>?): R {
        val page = seckillSkuNoticeService.queryPage(params)
        return R.ok().put("page", page) ?: R.error()
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    fun info(@PathVariable("id") id: Long?): R {
        val seckillSkuNotice = seckillSkuNoticeService.getById(id)
        return R.ok().put("seckillSkuNotice", seckillSkuNotice) ?: R.error()
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    fun save(@RequestBody seckillSkuNotice: SeckillSkuNoticeEntity): R {
        seckillSkuNoticeService.save(seckillSkuNotice)
        return R.ok()
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    fun update(@RequestBody seckillSkuNotice: SeckillSkuNoticeEntity): R {
        seckillSkuNoticeService.updateById(seckillSkuNotice)
        return R.ok()
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    fun delete(@RequestBody ids: Array<Long?>): R {
        seckillSkuNoticeService.removeByIds(Arrays.asList(*ids))
        return R.ok()
    }
}