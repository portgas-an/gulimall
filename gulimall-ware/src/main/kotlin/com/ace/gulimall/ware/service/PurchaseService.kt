package com.ace.gulimall.ware.service

import com.ace.gulimall.common.utils.PageUtils
import com.ace.gulimall.ware.entity.PurchaseEntity
import com.baomidou.mybatisplus.extension.service.IService

/**
 * 采购信息
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-17 15:34:08
 */
interface PurchaseService : IService<PurchaseEntity?> {
    fun queryPage(params: Map<String?, Any?>?): PageUtils
}