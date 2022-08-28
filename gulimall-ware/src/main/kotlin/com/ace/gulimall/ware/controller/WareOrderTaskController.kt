package com.ace.gulimall.ware.controller

import com.ace.gulimall.common.utils.R
import com.ace.gulimall.ware.entity.WareOrderTaskEntity
import com.ace.gulimall.ware.service.WareOrderTaskService
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
@RequestMapping("ware/wareordertask")
class WareOrderTaskController {
    @Autowired
    private lateinit var wareOrderTaskService: WareOrderTaskService

    /**
     * 列表
     */
    @RequestMapping("/list")
    fun list(@RequestParam params: Map<String?, Any?>?): R? {
        val page = wareOrderTaskService!!.queryPage(params)
        return R.ok().put("page", page)
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    fun info(@PathVariable("id") id: Long?): R? {
        val wareOrderTask = wareOrderTaskService!!.getById(id)
        return R.ok().put("wareOrderTask", wareOrderTask)
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    fun save(@RequestBody wareOrderTask: WareOrderTaskEntity): R {
        wareOrderTaskService!!.save(wareOrderTask)
        return R.ok()
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    fun update(@RequestBody wareOrderTask: WareOrderTaskEntity): R {
        wareOrderTaskService!!.updateById(wareOrderTask)
        return R.ok()
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    fun delete(@RequestBody ids: Array<Long?>): R {
        wareOrderTaskService!!.removeByIds(Arrays.asList(*ids))
        return R.ok()
    }
}