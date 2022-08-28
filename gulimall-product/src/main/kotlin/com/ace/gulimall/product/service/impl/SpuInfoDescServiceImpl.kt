package com.ace.gulimall.product.service.impl

import com.ace.gulimall.product.dao.SpuInfoDescDao
import com.ace.gulimall.product.entity.SpuInfoDescEntity
import com.ace.gulimall.product.service.SpuInfoDescService
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import com.ace.gulimall.common.utils.PageUtils
import com.ace.gulimall.common.utils.Query
import org.springframework.stereotype.Service

@Service("spuInfoDescService")
class SpuInfoDescServiceImpl : ServiceImpl<SpuInfoDescDao?, SpuInfoDescEntity?>(), SpuInfoDescService {
    override fun queryPage(params: Map<String?, Any?>?): PageUtils {
        val page = this.page(
            Query<SpuInfoDescEntity>().getPage(params),
            QueryWrapper()
        )
        return PageUtils(page)
    }
}