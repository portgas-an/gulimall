package com.ace.gulimall.product.service.impl

import com.ace.gulimall.common.utils.PageUtils
import com.ace.gulimall.common.utils.Query
import com.ace.gulimall.product.dao.ProductAttrValueDao
import com.ace.gulimall.product.entity.ProductAttrValueEntity
import com.ace.gulimall.product.service.ProductAttrValueService
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import org.springframework.stereotype.Service
@Service("productAttrValueService")
class ProductAttrValueServiceImpl : ServiceImpl<ProductAttrValueDao, ProductAttrValueEntity>(),
    ProductAttrValueService {
    override fun queryPage(params: Map<String?, Any?>?): PageUtils {
        val page = this.page(
            Query<ProductAttrValueEntity>().getPage(params),
            QueryWrapper()
        )
        return PageUtils(page)
    }
}