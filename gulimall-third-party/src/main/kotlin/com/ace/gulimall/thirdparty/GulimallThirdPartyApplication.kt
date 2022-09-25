package com.ace.gulimall.thirdparty

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration
import org.springframework.boot.runApplication

@SpringBootApplication(exclude = [DataSourceAutoConfiguration::class])
class GulimallThirdPartyApplication

fun main(args: Array<String>) {
    runApplication<GulimallThirdPartyApplication>(*args)
}
