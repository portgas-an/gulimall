package com.ace.gulimall.coupon.service

import com.ace.gulimall.common.utils.PageUtils
import com.ace.gulimall.coupon.entity.SpuBoundsEntity
import com.baomidou.mybatisplus.extension.service.IService

/**
 * 商品spu积分设置
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-17 14:24:23
 */
interface SpuBoundsService : IService<SpuBoundsEntity?> {
    fun queryPage(params: Map<String?, Any?>?): PageUtils
}