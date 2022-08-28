package com.ace.gulimall.product.service.impl

import com.ace.gulimall.product.dao.SpuInfoDao
import com.ace.gulimall.product.entity.SpuInfoEntity
import com.ace.gulimall.product.service.SpuInfoService
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import com.ace.gulimall.common.utils.PageUtils
import com.ace.gulimall.common.utils.Query
import org.springframework.stereotype.Service

@Service("spuInfoService")
class SpuInfoServiceImpl : ServiceImpl<SpuInfoDao?, SpuInfoEntity?>(), SpuInfoService {
    override fun queryPage(params: Map<String?, Any?>?): PageUtils {
        val page = this.page(
            Query<SpuInfoEntity>().getPage(params),
            QueryWrapper()
        )
        return PageUtils(page)
    }
}