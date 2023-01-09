package com.ace.gulimall.ware.service

import com.ace.gulimall.common.utils.PageUtils
import com.ace.gulimall.ware.entity.WareSkuEntity
import com.baomidou.mybatisplus.extension.service.IService

/**
 * 商品库存
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-17 15:34:08
 */
interface WareSkuService : IService<WareSkuEntity?> {
    fun queryPage(params: Map<String?, Any?>?): PageUtils
}