package com.ace.gulimall.coupon.service.impl

import com.ace.gulimall.common.utils.PageUtils
import com.ace.gulimall.common.utils.Query
import com.ace.gulimall.coupon.dao.HomeSubjectSpuDao
import com.ace.gulimall.coupon.entity.HomeSubjectSpuEntity
import com.ace.gulimall.coupon.service.HomeSubjectSpuService
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import org.springframework.stereotype.Service

@Service("homeSubjectSpuService")
class HomeSubjectSpuServiceImpl : ServiceImpl<HomeSubjectSpuDao?, HomeSubjectSpuEntity?>(), HomeSubjectSpuService {
    override fun queryPage(params: Map<String?, Any?>?): PageUtils {
        val page = this.page(
            Query<HomeSubjectSpuEntity>().getPage(params),
            QueryWrapper()
        )
        return PageUtils(page)
    }
}