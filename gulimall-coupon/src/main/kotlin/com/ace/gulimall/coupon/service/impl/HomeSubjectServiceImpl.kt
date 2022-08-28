package com.ace.gulimall.coupon.service.impl

import com.ace.gulimall.coupon.dao.HomeSubjectDao
import com.ace.gulimall.coupon.entity.HomeSubjectEntity
import com.ace.gulimall.coupon.service.HomeSubjectService
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import com.ace.gulimall.common.utils.PageUtils
import com.ace.gulimall.common.utils.Query
import org.springframework.stereotype.Service

@Service("homeSubjectService")
class HomeSubjectServiceImpl : ServiceImpl<HomeSubjectDao?, HomeSubjectEntity?>(), HomeSubjectService {
    override fun queryPage(params: Map<String?, Any?>?): PageUtils {
        val page = this.page(
            Query<HomeSubjectEntity>().getPage(params),
            QueryWrapper()
        )
        return PageUtils(page)
    }
}