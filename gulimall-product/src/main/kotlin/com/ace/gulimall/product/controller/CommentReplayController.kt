package com.ace.gulimall.product.controller

import com.ace.gulimall.common.utils.R
import com.ace.gulimall.product.entity.CommentReplayEntity
import com.ace.gulimall.product.service.CommentReplayService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.util.*

/**
 * 商品评价回复关系
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-16 17:43:10
 */
@RestController
@RequestMapping("product/commentreplay")
class CommentReplayController {
    @Autowired
    private lateinit var commentReplayService: CommentReplayService

    /**
     * 列表
     */
    @RequestMapping("/list")
    fun list(@RequestParam params: Map<String?, Any?>?): R {
        val page = commentReplayService!!.queryPage(params)
        return R.ok().put("page", page) ?: R.error()
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    fun info(@PathVariable("id") id: Long?): R {
        val commentReplay = commentReplayService!!.getById(id)
        return R.ok().put("commentReplay", commentReplay) ?: R.error()
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    fun save(@RequestBody commentReplay: CommentReplayEntity): R {
        commentReplayService!!.save(commentReplay)
        return R.ok()
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    fun update(@RequestBody commentReplay: CommentReplayEntity): R {
        commentReplayService!!.updateById(commentReplay)
        return R.ok()
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    fun delete(@RequestBody ids: Array<Long?>): R {
        commentReplayService!!.removeByIds(Arrays.asList(*ids))
        return R.ok()
    }
}