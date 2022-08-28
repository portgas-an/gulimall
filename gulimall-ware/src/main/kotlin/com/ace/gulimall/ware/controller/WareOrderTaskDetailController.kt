package com.ace.gulimall.ware.controller

import com.ace.gulimall.common.utils.R
import com.ace.gulimall.ware.entity.WareOrderTaskDetailEntity
import com.ace.gulimall.ware.service.WareOrderTaskDetailService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.util.*

/**
 * 库存工作单
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-17 15:34:08
 */
@RestController
@RequestMapping("ware/wareordertaskdetail")
class WareOrderTaskDetailController {
    @Autowired
    private lateinit var wareOrderTaskDetailService: WareOrderTaskDetailService

    /**
     * 列表
     */
    @RequestMapping("/list")
    fun list(@RequestParam params: Map<String?, Any?>?): R? {
        val page = wareOrderTaskDetailService!!.queryPage(params)
        return R.ok().put("page", page)
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    fun info(@PathVariable("id") id: Long?): R? {
        val wareOrderTaskDetail = wareOrderTaskDetailService!!.getById(id)
        return R.ok().put("wareOrderTaskDetail", wareOrderTaskDetail)
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    fun save(@RequestBody wareOrderTaskDetail: WareOrderTaskDetailEntity): R {
        wareOrderTaskDetailService!!.save(wareOrderTaskDetail)
        return R.ok()
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    fun update(@RequestBody wareOrderTaskDetail: WareOrderTaskDetailEntity): R {
        wareOrderTaskDetailService!!.updateById(wareOrderTaskDetail)
        return R.ok()
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    fun delete(@RequestBody ids: Array<Long?>): R {
        wareOrderTaskDetailService!!.removeByIds(Arrays.asList(*ids))
        return R.ok()
    }
}