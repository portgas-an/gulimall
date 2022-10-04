package com.ace.gulimall.product.service.impl

import com.ace.gulimall.common.utils.PageUtils
import com.ace.gulimall.common.utils.Query
import com.ace.gulimall.product.dao.BrandDao
import com.ace.gulimall.product.dao.CategoryBrandRelationDao
import com.ace.gulimall.product.dao.CategoryDao
import com.ace.gulimall.product.entity.CategoryBrandRelationEntity
import com.ace.gulimall.product.service.CategoryBrandRelationService
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service("categoryBrandRelationService")
class CategoryBrandRelationServiceImpl : ServiceImpl<CategoryBrandRelationDao, CategoryBrandRelationEntity>(),
    CategoryBrandRelationService {

    @Autowired
    private lateinit var brandDao: BrandDao

    @Autowired
    private lateinit var categoryDao: CategoryDao

    override fun queryPage(params: Map<String?, Any?>?): PageUtils {
        val page = this.page(
            Query<CategoryBrandRelationEntity>().getPage(params),
            QueryWrapper()
        )
        return PageUtils(page)
    }

    override fun catelogList(brandId: Long): List<CategoryBrandRelationEntity> {
        return list(
            QueryWrapper<CategoryBrandRelationEntity?>().apply {
                eq("brand_id", brandId)
            }
        )
    }

    override fun saveDetail(categoryBrandRelation: CategoryBrandRelationEntity) {
        //查询详细名字
        val brandEntity = brandDao.selectById(categoryBrandRelation.brandId)
        val categoryEntity = categoryDao.selectById(categoryBrandRelation.catelogId)
        categoryBrandRelation.brandName = brandEntity.name
        categoryBrandRelation.catelogName = categoryEntity.name
        this.save(categoryBrandRelation)
    }

    override fun updateBrand(brandId: Long?, name: String?) {
        this.update(
            CategoryBrandRelationEntity(brandId = brandId, brandName = name),
            UpdateWrapper<CategoryBrandRelationEntity>().eq("brand_id", brandId)
        )
    }

    override fun updateCategory(catId: Long?, name: String?) {
        getBaseMapper().updateCategory(catId, name)
    }
}