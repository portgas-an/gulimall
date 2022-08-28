package com.ace.gulimall.product.controller

import com.ace.gulimall.common.utils.R
import com.ace.gulimall.product.entity.AttrGroupEntity
import com.ace.gulimall.product.service.AttrGroupService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.util.*

/**
 * 属性分组
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-16 17:43:10
 */
@RestController
@RequestMapping("product/attrgroup")
class AttrGroupController {
    @Autowired
    private lateinit var attrGroupService: AttrGroupService

    /**
     * 列表
     */
    @RequestMapping("/list")
    fun list(@RequestParam params: Map<String?, Any?>?): R {
        val page = attrGroupService!!.queryPage(params)
        return R.ok().put("page", page) ?: R.error()
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{attrGroupId}")
    fun info(@PathVariable("attrGroupId") attrGroupId: Long?): R {
        val attrGroup = attrGroupService!!.getById(attrGroupId)
        return R.ok().put("attrGroup", attrGroup) ?: R.error()
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    fun save(@RequestBody attrGroup: AttrGroupEntity): R {
        attrGroupService!!.save(attrGroup)
        return R.ok()
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    fun update(@RequestBody attrGroup: AttrGroupEntity): R {
        attrGroupService!!.updateById(attrGroup)
        return R.ok()
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    fun delete(@RequestBody attrGroupIds: Array<Long?>): R {
        attrGroupService!!.removeByIds(Arrays.asList(*attrGroupIds))
        return R.ok()
    }
}