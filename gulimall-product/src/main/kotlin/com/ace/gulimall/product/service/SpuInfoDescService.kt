package com.ace.gulimall.product.service

import com.ace.gulimall.product.entity.SpuInfoDescEntity
import com.baomidou.mybatisplus.extension.service.IService

/**
 * spu信息介绍
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-16 16:28:06
 */
interface SpuInfoDescService : IService<SpuInfoDescEntity?> {
    fun queryPage(params: Map<String?, Any?>?): PageUtils
}