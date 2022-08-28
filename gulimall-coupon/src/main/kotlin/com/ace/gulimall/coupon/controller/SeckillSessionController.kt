package com.ace.gulimall.coupon.controller

import com.ace.gulimall.common.utils.R
import com.ace.gulimall.coupon.entity.SeckillSessionEntity
import com.ace.gulimall.coupon.service.SeckillSessionService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.util.*

/**
 * 秒杀活动场次
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-17 14:24:23
 */
@RestController
@RequestMapping("coupon/seckillsession")
class SeckillSessionController {
    @Autowired
    private lateinit var seckillSessionService: SeckillSessionService

    /**
     * 列表
     */
    @RequestMapping("/list")
    fun list(@RequestParam params: Map<String?, Any?>?): R {
        val page = seckillSessionService.queryPage(params)
        return R.ok().put("page", page) ?: R.error()
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    fun info(@PathVariable("id") id: Long?): R {
        val seckillSession = seckillSessionService.getById(id)
        return R.ok().put("seckillSession", seckillSession) ?: R.error()
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    fun save(@RequestBody seckillSession: SeckillSessionEntity): R {
        seckillSessionService.save(seckillSession)
        return R.ok()
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    fun update(@RequestBody seckillSession: SeckillSessionEntity): R {
        seckillSessionService.updateById(seckillSession)
        return R.ok()
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    fun delete(@RequestBody ids: Array<Long?>): R {
        seckillSessionService.removeByIds(Arrays.asList(*ids))
        return R.ok()
    }
}