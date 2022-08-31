package com.ace.gulimall.coupon.service

import com.ace.gulimall.common.utils.PageUtils
import com.ace.gulimall.coupon.entity.HomeAdvEntity
import com.baomidou.mybatisplus.extension.service.IService

/**
 * 首页轮播广告
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-17 14:24:23
 */
interface HomeAdvService : IService<HomeAdvEntity?> {
    fun queryPage(params: Map<String?, Any?>?): PageUtils
}