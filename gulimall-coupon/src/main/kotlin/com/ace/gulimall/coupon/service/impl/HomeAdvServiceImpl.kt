package com.ace.gulimall.coupon.service.impl

import com.ace.gulimall.coupon.dao.HomeAdvDao
import com.ace.gulimall.coupon.entity.HomeAdvEntity
import com.ace.gulimall.coupon.service.HomeAdvService
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import com.ace.gulimall.common.utils.PageUtils
import com.ace.gulimall.common.utils.Query
import org.springframework.stereotype.Service

@Service("homeAdvService")
class HomeAdvServiceImpl : ServiceImpl<HomeAdvDao?, HomeAdvEntity?>(), HomeAdvService {
    override fun queryPage(params: Map<String?, Any?>?): PageUtils {
        val page = this.page(
            Query<HomeAdvEntity>().getPage(params),
            QueryWrapper()
        )
        return PageUtils(page)
    }
}