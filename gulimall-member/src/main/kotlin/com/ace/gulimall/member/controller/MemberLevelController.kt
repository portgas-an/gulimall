package com.ace.gulimall.member.controller

import com.ace.gulimall.common.utils.R
import com.ace.gulimall.member.entity.MemberLevelEntity
import com.ace.gulimall.member.service.MemberLevelService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.util.*

/**
 * 会员等级
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-17 15:19:59
 */
@RestController
@RequestMapping("member/memberlevel")
class MemberLevelController {
    @Autowired
    private lateinit var memberLevelService: MemberLevelService

    /**
     * 列表
     */
    @RequestMapping("/list")
    fun list(@RequestParam params: Map<String?, Any?>?): R {
        val page = memberLevelService.queryPage(params)
        return R.ok().put("page", page) ?: R.error()
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    fun info(@PathVariable("id") id: Long?): R {
        val memberLevel = memberLevelService.getById(id)
        return R.ok().put("memberLevel", memberLevel) ?: R.error()
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    fun save(@RequestBody memberLevel: MemberLevelEntity?): R {
        memberLevelService.save(memberLevel)
        return R.ok()
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    fun update(@RequestBody memberLevel: MemberLevelEntity?): R {
        memberLevelService.updateById(memberLevel)
        return R.ok()
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    fun delete(@RequestBody ids: Array<Long?>): R {
        memberLevelService.removeByIds(Arrays.asList(*ids))
        return R.ok()
    }
}