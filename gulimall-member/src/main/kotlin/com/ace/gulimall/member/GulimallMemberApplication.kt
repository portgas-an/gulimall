package com.ace.gulimall.member

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.cloud.openfeign.EnableFeignClients

/**
 * 调用远程服务
 * 1.引入open-feign
 * 2.编写调用接口,xxxFeignService->对应的服务名称
 * 3.接口名称->requestMapping加进去对应的接口
 * 4.开启远程服务EnableFeignClients
 */
@EnableFeignClients(basePackages = ["com.ace.gulimall.member.feign"])
@EnableDiscoveryClient
@SpringBootApplication
class GulimallMemberApplication

fun main(args: Array<String>) {
    runApplication<GulimallMemberApplication>(*args)
}
