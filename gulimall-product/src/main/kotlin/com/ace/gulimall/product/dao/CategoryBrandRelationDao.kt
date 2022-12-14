package com.ace.gulimall.product.dao

import com.ace.gulimall.product.entity.CategoryBrandRelationEntity
import com.baomidou.mybatisplus.core.mapper.BaseMapper
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Param

/**
 * 品牌分类关联
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-16 16:28:06
 */
@Mapper
interface CategoryBrandRelationDao : BaseMapper<CategoryBrandRelationEntity> {
    fun updateCategory(@Param("catId") catId: Long?, @Param("name") name: String?)
}