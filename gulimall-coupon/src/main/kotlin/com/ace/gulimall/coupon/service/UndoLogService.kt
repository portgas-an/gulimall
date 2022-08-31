package com.ace.gulimall.coupon.service

import com.ace.gulimall.common.utils.PageUtils
import com.ace.gulimall.coupon.entity.UndoLogEntity
import com.baomidou.mybatisplus.extension.service.IService

/**
 *
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-17 14:24:23
 */
interface UndoLogService : IService<UndoLogEntity?> {
    fun queryPage(params: Map<String?, Any?>?): PageUtils
}