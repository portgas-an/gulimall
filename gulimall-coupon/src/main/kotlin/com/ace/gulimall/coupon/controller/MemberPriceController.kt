package com.ace.gulimall.coupon.controller

import com.ace.gulimall.common.utils.R
import com.ace.gulimall.coupon.entity.MemberPriceEntity
import com.ace.gulimall.coupon.service.MemberPriceService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.util.*

/**
 * 商品会员价格
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-17 14:24:23
 */
@RestController
@RequestMapping("coupon/memberprice")
class MemberPriceController {
    @Autowired
    private lateinit var memberPriceService: MemberPriceService

    /**
     * 列表
     */
    @RequestMapping("/list")
    fun list(@RequestParam params: Map<String?, Any?>?): R {
        val page = memberPriceService.queryPage(params)
        return R.ok().put("page", page) ?: R.error()
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    fun info(@PathVariable("id") id: Long?): R {
        val memberPrice = memberPriceService.getById(id)
        return R.ok().put("memberPrice", memberPrice) ?: R.error()
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    fun save(@RequestBody memberPrice: MemberPriceEntity): R {
        memberPriceService.save(memberPrice)
        return R.ok()
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    fun update(@RequestBody memberPrice: MemberPriceEntity): R {
        memberPriceService.updateById(memberPrice)
        return R.ok()
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    fun delete(@RequestBody ids: Array<Long?>): R {
        memberPriceService.removeByIds(Arrays.asList(*ids))
        return R.ok()
    }
}