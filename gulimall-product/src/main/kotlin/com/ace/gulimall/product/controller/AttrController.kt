package com.ace.gulimall.product.controller

import com.ace.gulimall.common.utils.R
import com.ace.gulimall.product.service.AttrService
import com.ace.gulimall.product.vo.AttrVo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

/**
 * 商品属性
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-16 17:43:10
 */
@RestController
@RequestMapping("product/attr")
class AttrController {
    @Autowired
    private lateinit var attrService: AttrService


    //product/base/list/{}
    @RequestMapping("/{attrType}/list/{catelogId}")
    fun baseAttrList(
        @RequestParam params: Map<String?, Any?>,
        @PathVariable("catelogId") catelog: Long?,
        @PathVariable("attrType") type: String,
    ): R {
        val page = attrService.queryBaseAttrPage(params, catelog, type)
        return R.ok().put("page", page)
    }

    /**
     * 列表
     */
    @RequestMapping("/list")
    fun list(@RequestParam params: Map<String?, Any?>?): R {
        val page = attrService.queryPage(params)
        return R.ok().put("page", page)
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{attrId}")
    fun info(@PathVariable("attrId") attrId: Long?): R {
        val response = attrService.getAttrInfo(attrId)
        return R.ok().put("attr", response)
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    fun save(@RequestBody attr: AttrVo): R {
        attrService.saveAttr(attr)
        return R.ok()
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    fun update(@RequestBody attr: AttrVo): R {
        attrService.updateAttr(attr)
        return R.ok()
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    fun delete(@RequestBody attrIds: Array<Long?>): R {
        attrService.removeByIds(listOf(*attrIds))
        return R.ok()
    }
}