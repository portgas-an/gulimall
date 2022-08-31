package com.ace.gulimall.gateway

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

//@EnableDiscoveryClient
@SpringBootApplication
class GulimallGatewayApplication

fun main(args: Array<String>) {
	runApplication<GulimallGatewayApplication>(*args)
}
