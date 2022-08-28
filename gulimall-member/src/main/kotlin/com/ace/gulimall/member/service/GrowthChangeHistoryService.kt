package com.ace.gulimall.member.service

import com.ace.gulimall.common.utils.PageUtils
import com.ace.gulimall.member.entity.GrowthChangeHistoryEntity
import com.baomidou.mybatisplus.extension.service.IService

/**
 * 成长值变化历史记录
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-17 15:19:59
 */
interface GrowthChangeHistoryService : IService<GrowthChangeHistoryEntity?> {
    fun queryPage(params: Map<String?, Any?>?): PageUtils
}