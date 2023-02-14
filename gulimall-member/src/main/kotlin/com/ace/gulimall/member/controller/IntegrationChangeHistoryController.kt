package com.ace.gulimall.member.controller

import com.ace.gulimall.common.utils.R
import com.ace.gulimall.member.entity.IntegrationChangeHistoryEntity
import com.ace.gulimall.member.service.IntegrationChangeHistoryService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.util.*

/**
 * 积分变化历史记录
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-17 15:19:59
 */
@RestController
@RequestMapping("member/integrationchangehistory")
class IntegrationChangeHistoryController {
    @Autowired
    private lateinit var integrationChangeHistoryService: IntegrationChangeHistoryService

    /**
     * 列表
     */
    @RequestMapping("/list")
    fun list(@RequestParam params: Map<String?, Any?>?): R {
        val page = integrationChangeHistoryService.queryPage(params)
        return R.ok().put("page", page) ?: R.error()
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    fun info(@PathVariable("id") id: Long?): R {
        val integrationChangeHistory = integrationChangeHistoryService.getById(id)
        return R.ok().put("integrationChangeHistory", integrationChangeHistory) ?: R.error()
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    fun save(@RequestBody integrationChangeHistory: IntegrationChangeHistoryEntity?): R {
        integrationChangeHistoryService.save(integrationChangeHistory)
        return R.ok()
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    fun update(@RequestBody integrationChangeHistory: IntegrationChangeHistoryEntity?): R {
        integrationChangeHistoryService.updateById(integrationChangeHistory)
        return R.ok()
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    fun delete(@RequestBody ids: Array<Long?>): R {
        integrationChangeHistoryService.removeByIds(Arrays.asList(*ids))
        return R.ok()
    }
}