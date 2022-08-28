package com.ace.gulimall.product

import org.mybatis.spring.annotation.MapperScan
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication


/**
 * 整合mybatis-plus
 * 倒入依赖
 *   <dependency>
 *       <groupId>com.baomidou</groupId>
 *       <artifactId>mybatis-plus-boot-starter</artifactId>
 *       <version>3.5.2</version>
 *   </dependency>
 *  配置
 *  1.配置数据源
 *      导入驱动
 *      设置application.yml相关信息
 *  2.配置mybatis-plus
 *      使用mapperScan扫描路径
 *      配置映射文件,sql
 *
 */
@MapperScan("com.ace.gulimall.product.dao")
@SpringBootApplication
class GulimallProductApplication

fun main(args: Array<String>) {
    runApplication<GulimallProductApplication>(*args)
}
