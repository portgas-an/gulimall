package com.ace.gulimall.product.service

import com.ace.gulimall.product.entity.SpuInfoEntity
import com.baomidou.mybatisplus.extension.service.IService
import com.ace.gulimall.common.utils.PageUtils

/**
 * spu信息
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-16 16:28:06
 */
interface SpuInfoService : IService<SpuInfoEntity?> {
    fun queryPage(params: Map<String?, Any?>?): PageUtils
}