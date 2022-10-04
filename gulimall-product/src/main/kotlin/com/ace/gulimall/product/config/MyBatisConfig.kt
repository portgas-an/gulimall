package com.ace.gulimall.product.config

import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor
import org.mybatis.spring.annotation.MapperScan
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.transaction.annotation.EnableTransactionManagement

@Configuration
@EnableTransactionManagement    //开启事物
@MapperScan("com.ace.gulimall.product.dao")
class MyBatisConfig {


    //引入分页插件
    @Bean
    fun paginationInterceptor(): PaginationInnerInterceptor {
        val paginationInnerInterceptor = PaginationInnerInterceptor()
        //设置请求页面大于最大页后操作,true返回首页,false继续请求,默认false
        paginationInnerInterceptor.isOverflow = true
        //设置最大单页限制数量,默认500条, -1不受限制
        paginationInnerInterceptor.maxLimit = 1000
        return paginationInnerInterceptor
    }
}