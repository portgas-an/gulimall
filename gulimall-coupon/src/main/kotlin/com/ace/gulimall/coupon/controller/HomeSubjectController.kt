package com.ace.gulimall.coupon.controller

import com.ace.gulimall.common.utils.R
import com.ace.gulimall.coupon.entity.HomeSubjectEntity
import com.ace.gulimall.coupon.service.HomeSubjectService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.util.*

/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-17 14:24:23
 */
@RestController
@RequestMapping("coupon/homesubject")
class HomeSubjectController {
    @Autowired
    private lateinit var homeSubjectService: HomeSubjectService

    /**
     * 列表
     */
    @RequestMapping("/list")
    fun list(@RequestParam params: Map<String?, Any?>?): R {
        val page = homeSubjectService.queryPage(params)
        return R.ok().put("page", page) ?: R.error()
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    fun info(@PathVariable("id") id: Long?): R {
        val homeSubject = homeSubjectService.getById(id)
        return R.ok().put("homeSubject", homeSubject) ?: R.error()
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    fun save(@RequestBody homeSubject: HomeSubjectEntity): R {
        homeSubjectService.save(homeSubject)
        return R.ok()
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    fun update(@RequestBody homeSubject: HomeSubjectEntity): R {
        homeSubjectService.updateById(homeSubject)
        return R.ok()
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    fun delete(@RequestBody ids: Array<Long?>): R {
        homeSubjectService.removeByIds(Arrays.asList(*ids))
        return R.ok()
    }
}