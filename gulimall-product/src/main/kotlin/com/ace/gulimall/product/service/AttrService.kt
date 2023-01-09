package com.ace.gulimall.product.service

import com.ace.gulimall.common.utils.PageUtils
import com.ace.gulimall.product.entity.AttrEntity
import com.ace.gulimall.product.vo.AttrVo
import com.baomidou.mybatisplus.extension.service.IService

/**
 * 商品属性
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-16 16:28:06
 */
interface AttrService : IService<AttrEntity> {
    fun queryPage(params: Map<String?, Any?>?): PageUtils
    fun saveAttr(attr: AttrVo)
    fun queryBaseAttrPage(params: Map<String?, Any?>, catelog: Long?): PageUtils
}