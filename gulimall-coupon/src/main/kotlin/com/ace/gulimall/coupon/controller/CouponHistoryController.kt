package com.ace.gulimall.coupon.controller

import com.ace.gulimall.common.utils.R
import com.ace.gulimall.coupon.entity.CouponHistoryEntity
import com.ace.gulimall.coupon.service.CouponHistoryService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.util.*

/**
 * 优惠券领取历史记录
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-17 14:24:23
 */
@RestController
@RequestMapping("coupon/couponhistory")
class CouponHistoryController {
    @Autowired
    private lateinit var couponHistoryService: CouponHistoryService

    /**
     * 列表
     */
    @RequestMapping("/list")
    fun list(@RequestParam params: Map<String?, Any?>?): R {
        val page = couponHistoryService.queryPage(params)
        return R.ok().put("page", page) ?: R.error()
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    fun info(@PathVariable("id") id: Long?): R {
        val couponHistory = couponHistoryService!!.getById(id)
        return R.ok().put("couponHistory", couponHistory) ?: R.error()
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    fun save(@RequestBody couponHistory: CouponHistoryEntity): R {
        couponHistoryService.save(couponHistory)
        return R.ok()
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    fun update(@RequestBody couponHistory: CouponHistoryEntity): R {
        couponHistoryService.updateById(couponHistory)
        return R.ok()
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    fun delete(@RequestBody ids: Array<Long?>): R {
        couponHistoryService!!.removeByIds(Arrays.asList(*ids))
        return R.ok()
    }
}