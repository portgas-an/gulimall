package com.ace.gulimall.product.dao

import com.ace.gulimall.product.entity.AttrAttrgroupRelationEntity
import com.baomidou.mybatisplus.core.mapper.BaseMapper
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Param

/**
 * 属性&属性分组关联
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-16 16:28:06
 */
@Mapper
interface AttrAttrgroupRelationDao : BaseMapper<AttrAttrgroupRelationEntity?>{
    fun deleteBatchRelation(@Param("entities")entities:List<AttrAttrgroupRelationEntity>)
}