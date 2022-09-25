package com.ace.gulimall.product.service.impl

import com.ace.gulimall.common.utils.PageUtils
import com.ace.gulimall.common.utils.Query
import com.ace.gulimall.product.dao.SkuImagesDao
import com.ace.gulimall.product.entity.SkuImagesEntity
import com.ace.gulimall.product.service.SkuImagesService
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import org.springframework.stereotype.Service
@Service("skuImagesService")
class SkuImagesServiceImpl : ServiceImpl<SkuImagesDao, SkuImagesEntity>(), SkuImagesService {
    override fun queryPage(params: Map<String?, Any?>?): PageUtils {
        val page = this.page(
            Query<SkuImagesEntity>().getPage(params),
            QueryWrapper()
        )
        return PageUtils(page)
    }
}