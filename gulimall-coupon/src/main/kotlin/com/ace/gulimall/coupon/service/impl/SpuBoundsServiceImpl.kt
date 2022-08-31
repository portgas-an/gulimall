package com.ace.gulimall.coupon.service.impl

import com.ace.gulimall.common.utils.PageUtils
import com.ace.gulimall.common.utils.Query
import com.ace.gulimall.coupon.dao.SpuBoundsDao
import com.ace.gulimall.coupon.entity.SpuBoundsEntity
import com.ace.gulimall.coupon.service.SpuBoundsService
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import org.springframework.stereotype.Service

@Service("spuBoundsService")
class SpuBoundsServiceImpl : ServiceImpl<SpuBoundsDao?, SpuBoundsEntity?>(), SpuBoundsService {
    override fun queryPage(params: Map<String?, Any?>?): PageUtils {
        val page = this.page(
            Query<SpuBoundsEntity>().getPage(params),
            QueryWrapper()
        )
        return PageUtils(page)
    }
}