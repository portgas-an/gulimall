package com.ace.gulimall.product.controller

import com.ace.gulimall.common.utils.R
import com.ace.gulimall.product.entity.AttrEntity
import com.ace.gulimall.product.service.AttrService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.util.*

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

    /**
     * 列表
     */
    @RequestMapping("/list")
    fun list(@RequestParam params: Map<String?, Any?>?): R {
        val page = attrService!!.queryPage(params)
        return R.ok().put("page", page) ?: R.error()
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{attrId}")
    fun info(@PathVariable("attrId") attrId: Long?): R {
        val attr = attrService!!.getById(attrId)
        return R.ok().put("attr", attr) ?: R.error()
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    fun save(@RequestBody attr: AttrEntity): R {
        attrService!!.save(attr)
        return R.ok()
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    fun update(@RequestBody attr: AttrEntity): R {
        attrService!!.updateById(attr)
        return R.ok()
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    fun delete(@RequestBody attrIds: Array<Long?>): R {
        attrService!!.removeByIds(Arrays.asList(*attrIds))
        return R.ok()
    }
}