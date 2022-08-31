package com.ace.gulimall.coupon

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient


@EnableDiscoveryClient
@SpringBootApplication
class GulimallCouponApplication

fun main(args: Array<String>) {
    runApplication<GulimallCouponApplication>(*args)
}
