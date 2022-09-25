package com.ace.gulimall.gateway

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.cors.CorsConfiguration
import org.springframework.web.cors.reactive.CorsWebFilter
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource

@Configuration
class TempCorsConfiguration : CorsConfiguration() {

    @Bean
    fun corsWebFilter(): CorsWebFilter {
        val source = UrlBasedCorsConfigurationSource()
        val corsConfiguration = CorsConfiguration().apply {
            addAllowedHeader("*")
            addAllowedMethod("*")
            addAllowedOriginPattern("*")
            allowCredentials = true
        }
        //1.配置跨域
        source.registerCorsConfiguration("/**", corsConfiguration)
        return CorsWebFilter(source)
    }
}