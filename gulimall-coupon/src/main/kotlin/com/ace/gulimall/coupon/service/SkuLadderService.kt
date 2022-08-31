package com.ace.gulimall.coupon.service

import com.ace.gulimall.common.utils.PageUtils
import com.ace.gulimall.coupon.entity.SkuLadderEntity
import com.baomidou.mybatisplus.extension.service.IService

/**
 * 商品阶梯价格
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-17 14:24:23
 */
interface SkuLadderService : IService<SkuLadderEntity?> {
    fun queryPage(params: Map<String?, Any?>?): PageUtils
}