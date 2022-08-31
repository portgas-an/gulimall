package com.ace.gulimall.member.service

import com.ace.gulimall.member.entity.IntegrationChangeHistoryEntity
import com.baomidou.mybatisplus.extension.service.IService

/**
 * 积分变化历史记录
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-17 15:19:59
 */
interface IntegrationChangeHistoryService : IService<IntegrationChangeHistoryEntity?> {
    fun queryPage(params: Map<String?, Any?>?): PageUtils
}