package com.ace.gulimall.order.service.impl

import com.ace.gulimall.order.dao.PaymentInfoDao
import com.ace.gulimall.order.entity.PaymentInfoEntity
import com.ace.gulimall.order.service.PaymentInfoService
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import org.springframework.stereotype.Service

@Service("paymentInfoService")
class PaymentInfoServiceImpl : ServiceImpl<PaymentInfoDao?, PaymentInfoEntity?>(), PaymentInfoService {
    override fun queryPage(params: Map<String?, Any?>?): PageUtils {
        val page = this.page(
            Query<PaymentInfoEntity>().getPage(params),
            QueryWrapper()
        )
        return PageUtils(page)
    }
}