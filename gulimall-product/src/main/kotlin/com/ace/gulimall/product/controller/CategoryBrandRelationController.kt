package com.ace.gulimall.product.controller

import com.ace.gulimall.common.utils.R
import com.ace.gulimall.product.entity.CategoryBrandRelationEntity
import com.ace.gulimall.product.service.CategoryBrandRelationService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

/**
 * 品牌分类关联
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-16 17:43:10
 */
@RestController
@RequestMapping("product/categorybrandrelation")
class CategoryBrandRelationController {
    @Autowired
    private lateinit var categoryBrandRelationService: CategoryBrandRelationService

    /**
     * 列表
     */
    @GetMapping("/catelog/list")
    fun catelogList(@RequestParam("brandId") brandId: Long): R {
        val data = categoryBrandRelationService.catelogList(brandId)
        return R.ok().put("data", data)
    }



    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    fun info(@PathVariable("id") id: Long?): R {
        val categoryBrandRelation = categoryBrandRelationService.getById(id)
        return R.ok().put("categoryBrandRelation", categoryBrandRelation) ?: R.error()
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    fun save(@RequestBody categoryBrandRelation: CategoryBrandRelationEntity): R {
        categoryBrandRelationService.saveDetail(categoryBrandRelation)
        return R.ok()
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    fun update(@RequestBody categoryBrandRelation: CategoryBrandRelationEntity): R {
        categoryBrandRelationService!!.updateById(categoryBrandRelation)
        return R.ok()
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    fun delete(@RequestBody ids: Array<Long?>): R {
        categoryBrandRelationService.removeByIds(listOf(*ids))
        return R.ok()
    }
}