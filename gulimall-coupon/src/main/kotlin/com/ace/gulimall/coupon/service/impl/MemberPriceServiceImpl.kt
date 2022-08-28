package com.ace.gulimall.coupon.service.impl

import com.ace.gulimall.coupon.dao.MemberPriceDao
import com.ace.gulimall.coupon.entity.MemberPriceEntity
import com.ace.gulimall.coupon.service.MemberPriceService
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import com.ace.gulimall.common.utils.PageUtils
import com.ace.gulimall.common.utils.Query
import org.springframework.stereotype.Service

@Service("memberPriceService")
class MemberPriceServiceImpl : ServiceImpl<MemberPriceDao?, MemberPriceEntity?>(), MemberPriceService {
    override fun queryPage(params: Map<String?, Any?>?): PageUtils {
        val page = this.page(
            Query<MemberPriceEntity>().getPage(params),
            QueryWrapper()
        )
        return PageUtils(page)
    }
}