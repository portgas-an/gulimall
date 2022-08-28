package com.ace.gulimall.member.controller

import com.ace.gulimall.common.utils.R
import com.ace.gulimall.member.entity.GrowthChangeHistoryEntity
import com.ace.gulimall.member.service.GrowthChangeHistoryService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.util.*

/**
 * 成长值变化历史记录
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-17 15:19:59
 */
@RestController
@RequestMapping("member/growthchangehistory")
class GrowthChangeHistoryController {

    @Autowired
    private lateinit var growthChangeHistoryService: GrowthChangeHistoryService

    /**
     * 列表
     */
    @RequestMapping("/list")
    fun list(@RequestParam params: Map<String?, Any?>?): R {
        val page = growthChangeHistoryService.queryPage(params)
        return R.ok().put("page", page) ?: R.error()
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    fun info(@PathVariable("id") id: Long?): R {
        val growthChangeHistory = growthChangeHistoryService.getById(id)
        return R.ok().put("growthChangeHistory", growthChangeHistory) ?: R.error()
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    fun save(@RequestBody growthChangeHistory: GrowthChangeHistoryEntity?): R {
        growthChangeHistoryService.save(growthChangeHistory)
        return R.ok()
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    fun update(@RequestBody growthChangeHistory: GrowthChangeHistoryEntity?): R {
        growthChangeHistoryService.updateById(growthChangeHistory)
        return R.ok()
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    fun delete(@RequestBody ids: Array<Long?>): R {
        growthChangeHistoryService.removeByIds(Arrays.asList(*ids))
        return R.ok()
    }
}