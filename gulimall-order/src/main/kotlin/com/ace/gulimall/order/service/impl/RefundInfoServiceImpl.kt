package com.ace.gulimall.order.service.impl

import com.ace.gulimall.common.utils.PageUtils
import com.ace.gulimall.common.utils.Query
import com.ace.gulimall.order.dao.RefundInfoDao
import com.ace.gulimall.order.entity.RefundInfoEntity
import com.ace.gulimall.order.service.RefundInfoService
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import org.springframework.stereotype.Service

@Service("refundInfoService")
class RefundInfoServiceImpl : ServiceImpl<RefundInfoDao?, RefundInfoEntity?>(), RefundInfoService {
    override fun queryPage(params: Map<String?, Any?>?): PageUtils {
        val page = this.page(
            Query<RefundInfoEntity>().getPage(params),
            QueryWrapper()
        )
        return PageUtils(page)
    }
}