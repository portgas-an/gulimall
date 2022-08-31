package com.ace.gulimall.product.service.impl

import com.ace.gulimall.product.dao.AttrDao
import com.ace.gulimall.product.entity.AttrEntity
import com.ace.gulimall.product.service.AttrService
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import org.springframework.stereotype.Service

@Service("attrService")
class AttrServiceImpl : ServiceImpl<AttrDao?, AttrEntity?>(), AttrService {
    override fun queryPage(params: Map<String?, Any?>?): PageUtils {
        val page = this.page(
            Query<AttrEntity>().getPage(params),
            QueryWrapper()
        )
        return PageUtils(page)
    }
}