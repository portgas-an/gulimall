package com.ace.gulimall.product.service.impl

import com.ace.gulimall.product.dao.SkuSaleAttrValueDao
import com.ace.gulimall.product.entity.SkuSaleAttrValueEntity
import com.ace.gulimall.product.service.SkuSaleAttrValueService
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import com.ace.gulimall.common.utils.PageUtils
import com.ace.gulimall.common.utils.Query
import org.springframework.stereotype.Service

@Service("skuSaleAttrValueService")
class SkuSaleAttrValueServiceImpl : ServiceImpl<SkuSaleAttrValueDao?, SkuSaleAttrValueEntity?>(),
    SkuSaleAttrValueService {
    override fun queryPage(params: Map<String?, Any?>?): PageUtils {
        val page = this.page(
            Query<SkuSaleAttrValueEntity>().getPage(params),
            QueryWrapper()
        )
        return PageUtils(page)
    }
}