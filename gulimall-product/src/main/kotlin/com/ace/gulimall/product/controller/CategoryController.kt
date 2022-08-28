package com.ace.gulimall.product.controller

import com.ace.gulimall.common.utils.R
import com.ace.gulimall.product.entity.CategoryEntity
import com.ace.gulimall.product.service.CategoryService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.util.*

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
     * 列表
     */
    @RequestMapping("/list")
    fun list(@RequestParam params: Map<String?, Any?>?): R {
        val page = categoryService!!.queryPage(params)
        return R.ok().put("page", page) ?: R.error()
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{catId}")
    fun info(@PathVariable("catId") catId: Long?): R {
        val category = categoryService!!.getById(catId)
        return R.ok().put("category", category) ?: R.error()
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
     * 修改
     */
    @RequestMapping("/update")
    fun update(@RequestBody category: CategoryEntity): R {
        categoryService!!.updateById(category)
        return R.ok()
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    fun delete(@RequestBody catIds: Array<Long?>): R {
        categoryService!!.removeByIds(Arrays.asList(*catIds))
        return R.ok()
    }
}