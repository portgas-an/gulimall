package com.ace.gulimall.ware.service.impl

import com.ace.gulimall.ware.dao.PurchaseDao
import com.ace.gulimall.ware.entity.PurchaseEntity
import com.ace.gulimall.ware.service.PurchaseService
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import org.springframework.stereotype.Service

@Service("purchaseService")
class PurchaseServiceImpl : ServiceImpl<PurchaseDao?, PurchaseEntity?>(), PurchaseService {
    override fun queryPage(params: Map<String?, Any?>?): PageUtils {
        val page = this.page(
            Query<PurchaseEntity>().getPage(params),
            QueryWrapper()
        )
        return PageUtils(page)
    }
}