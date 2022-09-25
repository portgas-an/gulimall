package com.ace.gulimall.product.service.impl

import com.ace.gulimall.common.utils.PageUtils
import com.ace.gulimall.common.utils.Query
import com.ace.gulimall.product.dao.SkuInfoDao
import com.ace.gulimall.product.entity.SkuInfoEntity
import com.ace.gulimall.product.service.SkuInfoService
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import org.springframework.stereotype.Service
@Service("skuInfoService")
class SkuInfoServiceImpl : ServiceImpl<SkuInfoDao, SkuInfoEntity>(), SkuInfoService {
    override fun queryPage(params: Map<String?, Any?>?): PageUtils {
        val page = this.page(
            Query<SkuInfoEntity>().getPage(params),
            QueryWrapper()
        )
        return PageUtils(page)
    }
}