package com.ace.gulimall.coupon.controller

import com.ace.gulimall.common.utils.R
import com.ace.gulimall.coupon.entity.HomeSubjectSpuEntity
import com.ace.gulimall.coupon.service.HomeSubjectSpuService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.util.*

/**
 * 专题商品
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-17 14:24:23
 */
@RestController
@RequestMapping("coupon/homesubjectspu")
class HomeSubjectSpuController {
    @Autowired
    private lateinit var homeSubjectSpuService: HomeSubjectSpuService

    /**
     * 列表
     */
    @RequestMapping("/list")
    fun list(@RequestParam params: Map<String?, Any?>?): R {
        val page = homeSubjectSpuService.queryPage(params)
        return R.ok().put("page", page) ?: R.error()
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    fun info(@PathVariable("id") id: Long?): R {
        val homeSubjectSpu = homeSubjectSpuService.getById(id)
        return R.ok().put("homeSubjectSpu", homeSubjectSpu) ?: R.error()
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    fun save(@RequestBody homeSubjectSpu: HomeSubjectSpuEntity): R {
        homeSubjectSpuService.save(homeSubjectSpu)
        return R.ok()
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    fun update(@RequestBody homeSubjectSpu: HomeSubjectSpuEntity): R {
        homeSubjectSpuService.updateById(homeSubjectSpu)
        return R.ok()
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    fun delete(@RequestBody ids: Array<Long?>): R {
        homeSubjectSpuService.removeByIds(Arrays.asList(*ids))
        return R.ok()
    }
}