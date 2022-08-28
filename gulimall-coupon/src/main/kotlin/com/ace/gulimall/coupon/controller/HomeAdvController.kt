package com.ace.gulimall.coupon.controller

import com.ace.gulimall.common.utils.R
import com.ace.gulimall.coupon.entity.HomeAdvEntity
import com.ace.gulimall.coupon.service.HomeAdvService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.util.*

/**
 * 首页轮播广告
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-17 14:24:23
 */
@RestController
@RequestMapping("coupon/homeadv")
class HomeAdvController {
    @Autowired
    private lateinit var homeAdvService: HomeAdvService

    /**
     * 列表
     */
    @RequestMapping("/list")
    fun list(@RequestParam params: Map<String?, Any?>?): R {
        val page = homeAdvService.queryPage(params)
        return R.ok().put("page", page) ?: R.error()
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    fun info(@PathVariable("id") id: Long?): R {
        val homeAdv = homeAdvService.getById(id)
        return R.ok().put("homeAdv", homeAdv) ?: R.error()
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    fun save(@RequestBody homeAdv: HomeAdvEntity): R {
        homeAdvService.save(homeAdv)
        return R.ok()
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    fun update(@RequestBody homeAdv: HomeAdvEntity): R {
        homeAdvService.updateById(homeAdv)
        return R.ok()
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    fun delete(@RequestBody ids: Array<Long?>): R {
        homeAdvService.removeByIds(Arrays.asList(*ids))
        return R.ok()
    }
}