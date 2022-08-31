package com.ace.gulimall.product.service

import com.ace.gulimall.product.entity.SpuImagesEntity
import com.baomidou.mybatisplus.extension.service.IService

/**
 * spu图片
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-16 16:28:06
 */
interface SpuImagesService : IService<SpuImagesEntity?> {
    fun queryPage(params: Map<String?, Any?>?): PageUtils
}