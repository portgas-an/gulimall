package com.ace.gulimall.coupon.controller

import com.ace.gulimall.common.utils.R
import com.ace.gulimall.coupon.entity.UndoLogEntity
import com.ace.gulimall.coupon.service.UndoLogService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.util.*

/**
 *
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-17 14:24:23
 */
@RestController
@RequestMapping("coupon/undolog")
class UndoLogController {
    @Autowired
    private lateinit var undoLogService: UndoLogService

    /**
     * 列表
     */
    @RequestMapping("/list")
    fun list(@RequestParam params: Map<String?, Any?>?): R {
        val page = undoLogService.queryPage(params)
        return R.ok().put("page", page) ?: R.error()
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    fun info(@PathVariable("id") id: Long?): R {
        val undoLog = undoLogService.getById(id)
        return R.ok().put("undoLog", undoLog) ?: R.error()
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    fun save(@RequestBody undoLog: UndoLogEntity): R {
        undoLogService.save(undoLog)
        return R.ok()
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    fun update(@RequestBody undoLog: UndoLogEntity): R {
        undoLogService.updateById(undoLog)
        return R.ok()
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    fun delete(@RequestBody ids: Array<Long?>): R {
        undoLogService.removeByIds(Arrays.asList(*ids))
        return R.ok()
    }
}