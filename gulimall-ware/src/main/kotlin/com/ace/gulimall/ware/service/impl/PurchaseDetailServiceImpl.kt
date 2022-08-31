package com.ace.gulimall.ware.service.impl

import com.ace.gulimall.ware.dao.PurchaseDetailDao
import com.ace.gulimall.ware.entity.PurchaseDetailEntity
import com.ace.gulimall.ware.service.PurchaseDetailService
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import org.springframework.stereotype.Service

@Service("purchaseDetailService")
class PurchaseDetailServiceImpl : ServiceImpl<PurchaseDetailDao?, PurchaseDetailEntity?>(), PurchaseDetailService {
    override fun queryPage(params: Map<String?, Any?>?): PageUtils {
        val page = this.page(
            Query<PurchaseDetailEntity>().getPage(params),
            QueryWrapper()
        )
        return PageUtils(page)
    }
}