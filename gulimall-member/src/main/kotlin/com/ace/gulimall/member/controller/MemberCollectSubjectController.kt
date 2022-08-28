package com.ace.gulimall.member.controller

import com.ace.gulimall.common.utils.R
import com.ace.gulimall.member.entity.MemberCollectSubjectEntity
import com.ace.gulimall.member.service.MemberCollectSubjectService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.util.*

/**
 * 会员收藏的专题活动
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-17 15:19:59
 */
@RestController
@RequestMapping("member/membercollectsubject")
class MemberCollectSubjectController {
    @Autowired
    private lateinit var memberCollectSubjectService: MemberCollectSubjectService

    /**
     * 列表
     */
    @RequestMapping("/list")
    fun list(@RequestParam params: Map<String?, Any?>?): R {
        val page = memberCollectSubjectService.queryPage(params)
        return R.ok().put("page", page) ?: R.error()
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    fun info(@PathVariable("id") id: Long?): R {
        val memberCollectSubject = memberCollectSubjectService.getById(id)
        return R.ok().put("memberCollectSubject", memberCollectSubject) ?: R.error()
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    fun save(@RequestBody memberCollectSubject: MemberCollectSubjectEntity?): R {
        memberCollectSubjectService.save(memberCollectSubject)
        return R.ok()
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    fun update(@RequestBody memberCollectSubject: MemberCollectSubjectEntity?): R {
        memberCollectSubjectService.updateById(memberCollectSubject)
        return R.ok()
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    fun delete(@RequestBody ids: Array<Long?>): R {
        memberCollectSubjectService.removeByIds(Arrays.asList(*ids))
        return R.ok()
    }
}