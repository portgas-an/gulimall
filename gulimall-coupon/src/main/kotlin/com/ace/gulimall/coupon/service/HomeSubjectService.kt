package com.ace.gulimall.coupon.service

import com.ace.gulimall.coupon.entity.HomeSubjectEntity
import com.baomidou.mybatisplus.extension.service.IService
import com.ace.gulimall.common.utils.PageUtils

/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-17 14:24:23
 */
interface HomeSubjectService : IService<HomeSubjectEntity?> {
    fun queryPage(params: Map<String?, Any?>?): PageUtils
}