package com.ace.gulimall.ware.service

import com.ace.gulimall.common.utils.PageUtils
import com.ace.gulimall.ware.entity.WareOrderTaskDetailEntity
import com.baomidou.mybatisplus.extension.service.IService

/**
 * 库存工作单
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-17 15:34:08
 */
interface WareOrderTaskDetailService : IService<WareOrderTaskDetailEntity?> {
    fun queryPage(params: Map<String?, Any?>?): PageUtils
}