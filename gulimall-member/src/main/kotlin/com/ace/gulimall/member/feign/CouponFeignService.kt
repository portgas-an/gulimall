package com.ace.gulimall.member.feign

import com.ace.gulimall.common.utils.R
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.RequestMapping

@FeignClient("gulimall-coupon")
interface CouponFeignService {

    @RequestMapping("/coupon/coupon/member/list")
    fun memberCoupons() : R

}