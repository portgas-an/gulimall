package com.ace.gulimall.product.controller

import com.ace.gulimall.common.utils.R
import com.ace.gulimall.product.entity.SpuCommentEntity
import com.ace.gulimall.product.service.SpuCommentService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.util.*

/**
 * 商品评价
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-16 17:43:10
 */
@RestController
@RequestMapping("product/spucomment")
class SpuCommentController {
    @Autowired
    private lateinit var spuCommentService: SpuCommentService

    /**
     * 列表
     */
    @RequestMapping("/list")
    fun list(@RequestParam params: Map<String?, Any?>?): R {
        val page = spuCommentService!!.queryPage(params)
        return R.ok().put("page", page) ?: R.error()
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    fun info(@PathVariable("id") id: Long?): R {
        val spuComment = spuCommentService!!.getById(id)
        return R.ok().put("spuComment", spuComment) ?: R.error()
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    fun save(@RequestBody spuComment: SpuCommentEntity): R {
        spuCommentService!!.save(spuComment)
        return R.ok()
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    fun update(@RequestBody spuComment: SpuCommentEntity): R {
        spuCommentService!!.updateById(spuComment)
        return R.ok()
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    fun delete(@RequestBody ids: Array<Long?>): R {
        spuCommentService!!.removeByIds(Arrays.asList(*ids))
        return R.ok()
    }
}