package com.ace.gulimall.member.controller

import com.ace.gulimall.member.entity.MemberLoginLogEntity
import com.ace.gulimall.member.service.MemberLoginLogService
import com.ace.gulimall.common.utils.PageUtils
import com.ace.gulimall.common.utils.R
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.util.*

/**
 * 会员登录记录
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-17 15:19:59
 */
@RestController
@RequestMapping("member/memberloginlog")
class MemberLoginLogController {
    @Autowired
    private lateinit var memberLoginLogService: MemberLoginLogService

    /**
     * 列表
     */
    @RequestMapping("/list")
    fun list(@RequestParam params: Map<String?, Any?>?): R {
        val page = memberLoginLogService.queryPage(params)
        return R.ok().put("page", page) ?: R.error()
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    fun info(@PathVariable("id") id: Long?): R {
        val memberLoginLog = memberLoginLogService.getById(id)
        return R.ok().put("memberLoginLog", memberLoginLog) ?: R.error()
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    fun save(@RequestBody memberLoginLog: MemberLoginLogEntity?): R {
        memberLoginLogService.save(memberLoginLog)
        return R.ok()
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    fun update(@RequestBody memberLoginLog: MemberLoginLogEntity?): R {
        memberLoginLogService.updateById(memberLoginLog)
        return R.ok()
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    fun delete(@RequestBody ids: Array<Long?>): R {
        memberLoginLogService.removeByIds(Arrays.asList(*ids))
        return R.ok()
    }
}