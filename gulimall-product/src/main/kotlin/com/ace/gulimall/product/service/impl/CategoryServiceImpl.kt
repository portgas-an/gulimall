package com.ace.gulimall.product.service.impl

import com.ace.gulimall.product.dao.CategoryDao
import com.ace.gulimall.product.entity.CategoryEntity
import com.ace.gulimall.product.service.CategoryService
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import org.springframework.stereotype.Service

@Service("categoryService")
class CategoryServiceImpl : ServiceImpl<CategoryDao?, CategoryEntity?>(), CategoryService {
    override fun queryPage(params: Map<String?, Any?>?): PageUtils {
        val page = this.page(
            Query<CategoryEntity>().getPage(params),
            QueryWrapper()
        )
        return PageUtils(page)
    }
}