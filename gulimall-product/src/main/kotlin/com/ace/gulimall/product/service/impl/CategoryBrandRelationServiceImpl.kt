package com.ace.gulimall.product.service.impl

import com.ace.gulimall.product.dao.CategoryBrandRelationDao
import com.ace.gulimall.product.entity.CategoryBrandRelationEntity
import com.ace.gulimall.product.service.CategoryBrandRelationService
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import com.ace.gulimall.common.utils.PageUtils
import com.ace.gulimall.common.utils.Query
import org.springframework.stereotype.Service

@Service("categoryBrandRelationService")
class CategoryBrandRelationServiceImpl : ServiceImpl<CategoryBrandRelationDao?, CategoryBrandRelationEntity?>(),
    CategoryBrandRelationService {
    override fun queryPage(params: Map<String?, Any?>?): PageUtils {
        val page = this.page(
            Query<CategoryBrandRelationEntity>().getPage(params),
            QueryWrapper()
        )
        return PageUtils(page)
    }
}