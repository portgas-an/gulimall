package com.ace.gulimall.coupon.controller

import com.ace.gulimall.common.utils.R
import com.ace.gulimall.coupon.entity.CouponEntity
import com.ace.gulimall.coupon.service.CouponService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.util.*

/**
 * 优惠券信息
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-17 14:24:23
 */
@RestController
@RequestMapping("coupon/coupon")
class CouponController {

    @Autowired
    private lateinit var couponService: CouponService

    /**
     * 列表
     */
    @RequestMapping("/list")
    fun list(@RequestParam params: Map<String?, Any?>?): R {
        val page = couponService.queryPage(params)
        return R.ok().put("page", page)  ?: R.error()
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    fun info(@PathVariable("id") id: Long?): R {
        val coupon = couponService.getById(id)
        return R.ok().put("coupon", coupon) ?: R.error()
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    fun save(@RequestBody coupon: CouponEntity): R {
        couponService.save(coupon)
        return R.ok()
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    fun update(@RequestBody coupon: CouponEntity): R {
        couponService.updateById(coupon)
        return R.ok()
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    fun delete(@RequestBody ids: Array<Long?>): R {
        couponService.removeByIds(Arrays.asList(*ids))
        return R.ok()
    }
}