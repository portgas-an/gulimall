package com.ace.gulimall.member.service.impl

import com.ace.gulimall.common.utils.PageUtils
import com.ace.gulimall.common.utils.Query
import com.ace.gulimall.member.dao.IntegrationChangeHistoryDao
import com.ace.gulimall.member.entity.IntegrationChangeHistoryEntity
import com.ace.gulimall.member.service.IntegrationChangeHistoryService
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.core.metadata.IPage
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import org.springframework.stereotype.Service

@Service("integrationChangeHistoryService")
class IntegrationChangeHistoryServiceImpl :
    ServiceImpl<IntegrationChangeHistoryDao?, IntegrationChangeHistoryEntity?>(), IntegrationChangeHistoryService {
    override fun queryPage(params: Map<String?, Any?>?): PageUtils {
        val page: IPage<IntegrationChangeHistoryEntity> = this.page(
            Query<IntegrationChangeHistoryEntity>().getPage(params),
            QueryWrapper<IntegrationChangeHistoryEntity>()
        )
        return PageUtils(page)
    }
}