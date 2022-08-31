package com.ace.gulimall.ware.service

import com.ace.gulimall.ware.entity.WareOrderTaskEntity
import com.baomidou.mybatisplus.extension.service.IService

/**
 * 库存工作单
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-17 15:34:08
 */
interface WareOrderTaskService : IService<WareOrderTaskEntity?> {
    fun queryPage(params: Map<String?, Any?>?): PageUtils
}