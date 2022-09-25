package com.ace.gulimall.product.service

import com.ace.gulimall.common.utils.PageUtils
import com.ace.gulimall.product.entity.AttrGroupEntity
import com.baomidou.mybatisplus.extension.service.IService

/**
 * 属性分组
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-16 16:28:06
 */
interface AttrGroupService : IService<AttrGroupEntity?> {
    fun queryPage(params: Map<String?, Any?>?): PageUtils
}