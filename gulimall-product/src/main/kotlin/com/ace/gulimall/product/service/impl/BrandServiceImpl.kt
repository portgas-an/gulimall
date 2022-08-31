package com.ace.gulimall.product.service.impl

import com.ace.gulimall.product.dao.BrandDao
import com.ace.gulimall.product.entity.BrandEntity
import com.ace.gulimall.product.service.BrandService
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import org.springframework.stereotype.Service

@Service("brandService")
class BrandServiceImpl : ServiceImpl<BrandDao?, BrandEntity?>(), BrandService {
    override fun queryPage(params: Map<String?, Any?>?): PageUtils {
        val page = this.page(
            Query<BrandEntity>().getPage(params),
            QueryWrapper()
        )
        return PageUtils(page)
    }
}