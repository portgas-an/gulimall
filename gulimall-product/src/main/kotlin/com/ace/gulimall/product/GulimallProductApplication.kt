package com.ace.gulimall.product

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient


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
 *
 * 逻辑删除
 *  bean加上逻辑删除注解@Tablelogic
 *
 * JSR303
 *  1.给bean添加注解:javax.validation.constraints.*
 *  2.加@Valid,不通过后会有默认相应
 *  3.校验bean后加BindingResult,就可以获取到校验结果
 *  4.分组校验
 *      @NotBlank(message = "xxxx", gourp=[xxxx.class]) 给校验什么组情况下进行校验
 *      @Validated(xxxx.class) 接口添加进行接口的分组
 *      如果没有指定分组group=[xxx.class],在@Validated(xxxx.class)情况下不校验
 *  5.自定义校验器
 *      1.新建一个校验器注解,推荐java然后再转
 *      2.关联自定义校验器和注解
 *      3.继承ConstraintValidator，再init方法取所需要的类型,再重写isValid是否成功
 *
 * 统一异常
 *  @RestControllerAdvice添加到类上,标记可以处理返回异常
 *  @ExceptionHandler(value=xxxx.class)代表处理什么类型的异常
 */
@EnableDiscoveryClient
@SpringBootApplication
class GulimallProductApplication

fun main(args: Array<String>) {
    runApplication<GulimallProductApplication>(*args)
}
