package com.ace.gulimall.coupon.service

import com.ace.gulimall.common.utils.PageUtils
import com.ace.gulimall.coupon.entity.SeckillSkuRelationEntity
import com.baomidou.mybatisplus.extension.service.IService

/**
 * 秒杀活动商品关联
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-17 14:24:23
 */
interface SeckillSkuRelationService : IService<SeckillSkuRelationEntity?> {
    fun queryPage(params: Map<String?, Any?>?): PageUtils
}