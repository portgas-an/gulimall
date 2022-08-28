package com.ace.gulimall.coupon.service

import com.ace.gulimall.coupon.entity.SeckillSessionEntity
import com.baomidou.mybatisplus.extension.service.IService
import com.ace.gulimall.common.utils.PageUtils

/**
 * 秒杀活动场次
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-17 14:24:23
 */
interface SeckillSessionService : IService<SeckillSessionEntity?> {
    fun queryPage(params: Map<String?, Any?>?): PageUtils
}