package com.ace.gulimall.product.service.impl

import com.ace.gulimall.product.dao.SpuImagesDao
import com.ace.gulimall.product.entity.SpuImagesEntity
import com.ace.gulimall.product.service.SpuImagesService
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import com.ace.gulimall.common.utils.PageUtils
import com.ace.gulimall.common.utils.Query
import org.springframework.stereotype.Service

@Service("spuImagesService")
class SpuImagesServiceImpl : ServiceImpl<SpuImagesDao?, SpuImagesEntity?>(), SpuImagesService {
    override fun queryPage(params: Map<String?, Any?>?): PageUtils {
        val page = this.page(
            Query<SpuImagesEntity>().getPage(params),
            QueryWrapper()
        )
        return PageUtils(page)
    }
}