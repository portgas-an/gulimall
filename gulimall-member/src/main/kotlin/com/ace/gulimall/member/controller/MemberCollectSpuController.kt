package com.ace.gulimall.member.controller

import com.ace.gulimall.common.utils.PageUtils
import com.ace.gulimall.common.utils.R
import com.ace.gulimall.member.entity.MemberCollectSpuEntity
import com.ace.gulimall.member.service.MemberCollectSpuService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.util.*

/**
 * 会员收藏的商品
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-17 15:19:59
 */
@RestController
@RequestMapping("member/membercollectspu")
class MemberCollectSpuController {
    @Autowired
    private lateinit var memberCollectSpuService: MemberCollectSpuService

    /**
     * 列表
     */
    @RequestMapping("/list")
    fun list(@RequestParam params: Map<String?, Any?>?): R {
        val page: PageUtils = memberCollectSpuService.queryPage(params)
        return R.ok().put("page", page) ?: R.error()
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    fun info(@PathVariable("id") id: Long?): R {
        val memberCollectSpu = memberCollectSpuService.getById(id)
        return R.ok().put("memberCollectSpu", memberCollectSpu) ?: R.error()
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    fun save(@RequestBody memberCollectSpu: MemberCollectSpuEntity?): R {
        memberCollectSpuService.save(memberCollectSpu)
        return R.ok()
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    fun update(@RequestBody memberCollectSpu: MemberCollectSpuEntity?): R {
        memberCollectSpuService.updateById(memberCollectSpu)
        return R.ok()
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    fun delete(@RequestBody ids: Array<Long?>): R {
        memberCollectSpuService.removeByIds(Arrays.asList(*ids))
        return R.ok()
    }
}