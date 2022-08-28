package com.ace.gulimall.product.controller

import com.ace.gulimall.common.utils.R
import com.ace.gulimall.product.entity.AttrAttrgroupRelationEntity
import com.ace.gulimall.product.service.AttrAttrgroupRelationService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.util.*

/**
 * 属性&属性分组关联
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-16 17:43:10
 */
@RestController
@RequestMapping("product/attrattrgrouprelation")
class AttrAttrgroupRelationController {
    @Autowired
    private lateinit var attrAttrgroupRelationService: AttrAttrgroupRelationService

    /**
     * 列表
     */
    @RequestMapping("/list")
    fun list(@RequestParam params: Map<String?, Any?>?): R {
        val page = attrAttrgroupRelationService!!.queryPage(params)
        return R.ok().put("page", page) ?: R.error()
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    fun info(@PathVariable("id") id: Long?): R {
        val attrAttrgroupRelation = attrAttrgroupRelationService!!.getById(id)
        return R.ok().put("attrAttrgroupRelation", attrAttrgroupRelation) ?: R.error()
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    fun save(@RequestBody attrAttrgroupRelation: AttrAttrgroupRelationEntity): R {
        attrAttrgroupRelationService!!.save(attrAttrgroupRelation)
        return R.ok()
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    fun update(@RequestBody attrAttrgroupRelation: AttrAttrgroupRelationEntity): R {
        attrAttrgroupRelationService!!.updateById(attrAttrgroupRelation)
        return R.ok()
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    fun delete(@RequestBody ids: Array<Long?>): R {
        attrAttrgroupRelationService!!.removeByIds(Arrays.asList(*ids))
        return R.ok()
    }
}