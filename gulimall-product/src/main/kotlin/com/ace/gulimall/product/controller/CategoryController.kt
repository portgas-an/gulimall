package com.ace.gulimall.product.controller

import com.ace.gulimall.common.utils.R
import com.ace.gulimall.product.entity.CategoryEntity
import com.ace.gulimall.product.service.CategoryService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

/**
 * 商品三级分类
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-16 17:43:10
 */
@RestController
@RequestMapping("product/category")
class CategoryController {
    @Autowired
    private lateinit var categoryService: CategoryService

    /**
     * 查处所有分类以及树形结构,以树形结构组装
     */
    @RequestMapping("/list/tree")
    fun list(@RequestParam params: Map<String?, Any?>?): R {
        val entitys :List<CategoryEntity>? =  categoryService.listWithTree()
        return R.ok().put("data", entitys)
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{catId}")
    fun info(@PathVariable("catId") catId: Long?): R {
        val category = categoryService.getById(catId)
        return R.ok().put("category", category)
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    fun save(@RequestBody category: CategoryEntity): R {
        categoryService!!.save(category)
        return R.ok()
    }

    /**
     * 更新分类排序
     */
    @RequestMapping("/update/sort")
    fun update(@RequestBody category: Array<CategoryEntity>): R {
        categoryService.updateBatchById(listOf(*category))
        return R.ok()
    }

    /**
     * 删除
     * RequestBody必须发送post
     */
    @RequestMapping("/delete")
    fun delete(@RequestBody catIds: Array<Long>): R {

        //检查当前删除菜单是否被别的地方饮用,
        categoryService.removeMeunByIds(listOf(*catIds))
//        categoryService!!.removeByIds(Arrays.asList(*catIds))
        return R.ok()
    }
}