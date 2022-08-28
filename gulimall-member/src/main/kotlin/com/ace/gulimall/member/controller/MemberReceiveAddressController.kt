package com.ace.gulimall.member.controller

import com.ace.gulimall.common.utils.R
import com.ace.gulimall.member.entity.MemberReceiveAddressEntity
import com.ace.gulimall.member.service.MemberReceiveAddressService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.util.*

/**
 * 会员收货地址
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-17 15:19:59
 */
@RestController
@RequestMapping("member/memberreceiveaddress")
class MemberReceiveAddressController {
    @Autowired
    private lateinit var memberReceiveAddressService: MemberReceiveAddressService

    /**
     * 列表
     */
    @RequestMapping("/list")
    fun list(@RequestParam params: Map<String?, Any?>?): R {
        val page = memberReceiveAddressService.queryPage(params)
        return R.ok().put("page", page) ?: R.error()
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    fun info(@PathVariable("id") id: Long?): R {
        val memberReceiveAddress = memberReceiveAddressService.getById(id)
        return R.ok().put("memberReceiveAddress", memberReceiveAddress) ?: R.error()
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    fun save(@RequestBody memberReceiveAddress: MemberReceiveAddressEntity?): R {
        memberReceiveAddressService.save(memberReceiveAddress)
        return R.ok()
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    fun update(@RequestBody memberReceiveAddress: MemberReceiveAddressEntity?): R {
        memberReceiveAddressService.updateById(memberReceiveAddress)
        return R.ok()
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    fun delete(@RequestBody ids: Array<Long?>): R {
        memberReceiveAddressService.removeByIds(Arrays.asList(*ids))
        return R.ok()
    }
}