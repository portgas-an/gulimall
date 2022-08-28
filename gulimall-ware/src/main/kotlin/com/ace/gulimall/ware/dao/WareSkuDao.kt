package com.ace.gulimall.ware.dao

import com.ace.gulimall.ware.entity.WareSkuEntity
import com.baomidou.mybatisplus.core.mapper.BaseMapper
import org.apache.ibatis.annotations.Mapper

/**
 * 商品库存
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-17 15:34:08
 */
@Mapper
interface WareSkuDao : BaseMapper<WareSkuEntity?>