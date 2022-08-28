package com.ace.gulimall.member.service

import com.ace.gulimall.member.entity.UndoLogEntity
import com.baomidou.mybatisplus.extension.service.IService
import com.ace.gulimall.common.utils.PageUtils

/**
 *
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-17 15:19:59
 */
interface UndoLogService : IService<UndoLogEntity?> {
    fun queryPage(params: Map<String?, Any?>?): PageUtils
}