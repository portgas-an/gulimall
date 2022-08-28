package com.ace.gulimall.ware.controller

import com.ace.gulimall.common.utils.R
import com.ace.gulimall.ware.entity.WareInfoEntity
import com.ace.gulimall.ware.service.WareInfoService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.util.*

/**
 * 仓库信息
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-17 15:34:08
 */
@RestController
@RequestMapping("ware/wareinfo")
class WareInfoController {
    @Autowired
    private lateinit var wareInfoService: WareInfoService

    /**
     * 列表
     */
    @RequestMapping("/list")
    fun list(@RequestParam params: Map<String?, Any?>?): R? {
        val page = wareInfoService!!.queryPage(params)
        return R.ok().put("page", page)
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    fun info(@PathVariable("id") id: Long?): R? {
        val wareInfo = wareInfoService!!.getById(id)
        return R.ok().put("wareInfo", wareInfo)
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    fun save(@RequestBody wareInfo: WareInfoEntity): R {
        wareInfoService!!.save(wareInfo)
        return R.ok()
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    fun update(@RequestBody wareInfo: WareInfoEntity): R {
        wareInfoService!!.updateById(wareInfo)
        return R.ok()
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    fun delete(@RequestBody ids: Array<Long?>): R {
        wareInfoService!!.removeByIds(Arrays.asList(*ids))
        return R.ok()
    }
}