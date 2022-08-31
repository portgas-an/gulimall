package com.ace.gulimall.product.service

import com.ace.gulimall.product.entity.SpuCommentEntity
import com.baomidou.mybatisplus.extension.service.IService

/**
 * 商品评价
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-16 16:28:06
 */
interface SpuCommentService : IService<SpuCommentEntity?> {
    fun queryPage(params: Map<String?, Any?>?): PageUtils
}