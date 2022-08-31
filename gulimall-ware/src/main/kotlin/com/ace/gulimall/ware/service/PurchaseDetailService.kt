package com.ace.gulimall.ware.service

import com.ace.gulimall.ware.entity.PurchaseDetailEntity
import com.baomidou.mybatisplus.extension.service.IService

/**
 *
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-17 15:34:08
 */
interface PurchaseDetailService : IService<PurchaseDetailEntity?> {
    fun queryPage(params: Map<String?, Any?>?): PageUtils
}