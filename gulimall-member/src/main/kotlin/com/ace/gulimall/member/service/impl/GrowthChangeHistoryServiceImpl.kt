package com.ace.gulimall.member.service.impl

import com.ace.gulimall.common.utils.PageUtils
import com.ace.gulimall.common.utils.Query
import com.ace.gulimall.member.dao.GrowthChangeHistoryDao
import com.ace.gulimall.member.entity.GrowthChangeHistoryEntity
import com.ace.gulimall.member.service.GrowthChangeHistoryService
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.core.metadata.IPage
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import org.springframework.stereotype.Service

@Service("growthChangeHistoryService")
class GrowthChangeHistoryServiceImpl : ServiceImpl<GrowthChangeHistoryDao?, GrowthChangeHistoryEntity?>(),
    GrowthChangeHistoryService {
    override fun queryPage(params: Map<String?, Any?>?): PageUtils {
        val page: IPage<GrowthChangeHistoryEntity> = this.page(
            Query<GrowthChangeHistoryEntity>().getPage(params),
            QueryWrapper<GrowthChangeHistoryEntity>()
        )
        return PageUtils(page)
    }
}