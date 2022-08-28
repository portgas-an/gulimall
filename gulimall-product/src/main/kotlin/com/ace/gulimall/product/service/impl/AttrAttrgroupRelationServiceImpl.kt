package com.ace.gulimall.product.service.impl

import com.ace.gulimall.product.dao.AttrAttrgroupRelationDao
import com.ace.gulimall.product.entity.AttrAttrgroupRelationEntity
import com.ace.gulimall.product.service.AttrAttrgroupRelationService
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import com.ace.gulimall.common.utils.PageUtils
import com.ace.gulimall.common.utils.Query
import org.springframework.stereotype.Service

@Service("attrAttrgroupRelationService")
class AttrAttrgroupRelationServiceImpl : ServiceImpl<AttrAttrgroupRelationDao?, AttrAttrgroupRelationEntity?>(),
    AttrAttrgroupRelationService {
    override fun queryPage(params: Map<String?, Any?>?): PageUtils {
        val page = this.page(
            Query<AttrAttrgroupRelationEntity>().getPage(params),
            QueryWrapper()
        )
        return PageUtils(page)
    }
}