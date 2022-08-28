package com.ace.gulimall.member.controller

import com.ace.gulimall.common.utils.R
import com.ace.gulimall.member.entity.MemberEntity
import com.ace.gulimall.member.service.MemberService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.util.*

/**
 * 会员
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-17 15:19:59
 */
@RestController
@RequestMapping("member/member")
class MemberController {
    @Autowired
    private lateinit var memberService: MemberService

    /**
     * 列表
     */
    @RequestMapping("/list")
    fun list(@RequestParam params: Map<String?, Any?>?): R {
        val page = memberService.queryPage(params)
        return R.ok().put("page", page) ?: R.error()
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    fun info(@PathVariable("id") id: Long?): R {
        val member = memberService.getById(id)
        return R.ok().put("member", member) ?: R.error()
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    fun save(@RequestBody member: MemberEntity?): R {
        memberService.save(member)
        return R.ok()
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    fun update(@RequestBody member: MemberEntity?): R {
        memberService.updateById(member)
        return R.ok()
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    fun delete(@RequestBody ids: Array<Long?>): R {
        memberService.removeByIds(Arrays.asList(*ids))
        return R.ok()
    }
}