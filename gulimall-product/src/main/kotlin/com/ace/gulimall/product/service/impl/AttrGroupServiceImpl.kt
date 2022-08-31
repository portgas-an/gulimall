package com.ace.gulimall.product.service.impl

import com.ace.gulimall.product.dao.AttrGroupDao
import com.ace.gulimall.product.entity.AttrGroupEntity
import com.ace.gulimall.product.service.AttrGroupService
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import org.springframework.stereotype.Service

@Service("attrGroupService")
class AttrGroupServiceImpl : ServiceImpl<AttrGroupDao?, AttrGroupEntity?>(), AttrGroupService {
    override fun queryPage(params: Map<String?, Any?>?): PageUtils {
        val page = this.page(
            Query<AttrGroupEntity>().getPage(params),
            QueryWrapper()
        )
        return PageUtils(page)
    }
}