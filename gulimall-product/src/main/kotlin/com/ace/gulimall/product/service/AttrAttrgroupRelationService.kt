package com.ace.gulimall.product.service

import com.ace.gulimall.product.entity.AttrAttrgroupRelationEntity
import com.baomidou.mybatisplus.extension.service.IService
import com.ace.gulimall.common.utils.PageUtils

/**
 * 属性&属性分组关联
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-16 16:28:06
 */
interface AttrAttrgroupRelationService : IService<AttrAttrgroupRelationEntity?> {
    fun queryPage(params: Map<String?, Any?>?): PageUtils
}