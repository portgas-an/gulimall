package com.ace.gulimall.member.controller

import com.ace.gulimall.common.utils.R
import com.ace.gulimall.member.entity.MemberStatisticsInfoEntity
import com.ace.gulimall.member.service.MemberStatisticsInfoService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.util.*

/**
 * 会员统计信息
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-17 15:19:59
 */
@RestController
@RequestMapping("member/memberstatisticsinfo")
class MemberStatisticsInfoController {
    @Autowired
    private lateinit var memberStatisticsInfoService: MemberStatisticsInfoService

    /**
     * 列表
     */
    @RequestMapping("/list")
    fun list(@RequestParam params: Map<String?, Any?>?): R {
        val page = memberStatisticsInfoService.queryPage(params)
        return R.ok().put("page", page) ?: R.error()
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    fun info(@PathVariable("id") id: Long?): R {
        val memberStatisticsInfo = memberStatisticsInfoService.getById(id)
        return R.ok().put("memberStatisticsInfo", memberStatisticsInfo) ?: R.error()
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    fun save(@RequestBody memberStatisticsInfo: MemberStatisticsInfoEntity?): R {
        memberStatisticsInfoService.save(memberStatisticsInfo)
        return R.ok()
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    fun update(@RequestBody memberStatisticsInfo: MemberStatisticsInfoEntity?): R {
        memberStatisticsInfoService.updateById(memberStatisticsInfo)
        return R.ok()
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    fun delete(@RequestBody ids: Array<Long?>): R {
        memberStatisticsInfoService.removeByIds(Arrays.asList(*ids))
        return R.ok()
    }
}