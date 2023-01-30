package com.ace.gulimall.product.controller

import com.ace.gulimall.common.utils.R
import com.ace.gulimall.product.entity.AttrAttrgroupRelationEntity
import com.ace.gulimall.product.entity.AttrEntity
import com.ace.gulimall.product.entity.AttrGroupEntity
import com.ace.gulimall.product.service.AttrGroupService
import com.ace.gulimall.product.service.AttrService
import com.ace.gulimall.product.service.CategoryService
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

    @Autowired
    private lateinit var categoryService: CategoryService

    @Autowired
    private lateinit var attrService: AttrService

    /**
     * 列表
     */
    @RequestMapping("/list/{catelogId}")
    fun list(@RequestParam params: Map<String, Any>, @PathVariable("catelogId") catelogId: Long): R {
//        val page = attrGroupService.queryPage(params)
        val page = attrGroupService.queryPage(params, catelogId)

        return R.ok().put("page", page)
    }

    @RequestMapping("/{attrGroupId}/attr/relation")
    fun attrRelation(@PathVariable("attrGroupId") attrGroupId: Long): R {
        val entities: List<AttrEntity> = attrService.getRelationAttr(attrGroupId)
        return R.ok().put("data", entities)
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{attrGroupId}")
    fun info(@PathVariable("attrGroupId") attrGroupId: Long): R {
        val attrGroup = attrGroupService.getById(attrGroupId)

        val path = categoryService.findCategoryPath(attrGroup.catelogId ?: 0)
        attrGroup.categoryPath = path
        return R.ok().put("attrGroup", attrGroup)
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    fun save(@RequestBody attrGroup: AttrGroupEntity): R {
        attrGroupService!!.save(attrGroup)
        return R.ok()
    }

    @RequestMapping("/attr/relation/delete")
    fun deleteRelation(@RequestBody vos : Array<AttrAttrgroupRelationEntity>): R {
        attrService.deleteRelation(vos)
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