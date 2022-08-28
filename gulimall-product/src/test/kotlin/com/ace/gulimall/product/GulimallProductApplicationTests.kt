package com.ace.gulimall.product

import com.ace.gulimall.product.entity.BrandEntity
import com.ace.gulimall.product.service.BrandService
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest


@SpringBootTest
class GulimallProductApplicationTests {

    @Autowired
    private lateinit var brandService: BrandService

    @Test
    fun contextLoads() {

    }

}
