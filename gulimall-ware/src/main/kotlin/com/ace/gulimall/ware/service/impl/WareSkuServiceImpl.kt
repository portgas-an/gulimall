package com.ace.gulimall.ware.service.impl

import com.ace.gulimall.ware.dao.WareSkuDao
import com.ace.gulimall.ware.entity.WareSkuEntity
import com.ace.gulimall.ware.service.WareSkuService
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import org.springframework.stereotype.Service

@Service("wareSkuService")
class WareSkuServiceImpl : ServiceImpl<WareSkuDao?, WareSkuEntity?>(), WareSkuService {
    override fun queryPage(params: Map<String?, Any?>?): PageUtils {
        val page = this.page(
            Query<WareSkuEntity>().getPage(params),
            QueryWrapper()
        )
        return PageUtils(page)
    }
}