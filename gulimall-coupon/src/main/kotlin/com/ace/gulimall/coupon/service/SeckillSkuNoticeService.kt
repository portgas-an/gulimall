package com.ace.gulimall.coupon.service

import com.ace.gulimall.coupon.entity.SeckillSkuNoticeEntity
import com.baomidou.mybatisplus.extension.service.IService
import com.ace.gulimall.common.utils.PageUtils

/**
 * 秒杀商品通知订阅
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-17 14:24:23
 */
interface SeckillSkuNoticeService : IService<SeckillSkuNoticeEntity?> {
    fun queryPage(params: Map<String?, Any?>?): PageUtils
}