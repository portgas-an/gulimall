package com.ace.gulimall.product.service.impl

import com.ace.gulimall.common.utils.PageUtils
import com.ace.gulimall.common.utils.Query
import com.ace.gulimall.product.dao.BrandDao
import com.ace.gulimall.product.entity.BrandEntity
import com.ace.gulimall.product.service.BrandService
import com.ace.gulimall.product.service.CategoryBrandRelationService
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service("brandService")
class BrandServiceImpl : ServiceImpl<BrandDao, BrandEntity>(), BrandService {

    @Autowired
    private lateinit var categoryBrandRelationService: CategoryBrandRelationService

    override fun queryPage(params: Map<String?, Any?>?): PageUtils {
        val key = params?.get("key") as String
        print(key)
        val queryWrapper = QueryWrapper<BrandEntity>()
        if (!key.isNullOrBlank()) {
            queryWrapper.eq("brand_id", key).or().like("name", key)
        }
        val page = this.page(
            Query<BrandEntity>().getPage(params),
            queryWrapper
        )
        return PageUtils(page)
    }

    @Transactional
    override fun updateDetail(brand: BrandEntity) {
        //保证冗余字段一致
        this.updateById(brand)
        if (!brand.name.isNullOrEmpty()){
            //同步更新其他关联表中数据
            categoryBrandRelationService.updateBrand(brand.brandId, brand.name)
            //todo 更新其他关联

        }
    }
}