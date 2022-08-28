package com.ace.gulimall.coupon.controller

import com.ace.gulimall.common.utils.R
import com.ace.gulimall.coupon.entity.CouponSpuRelationEntity
import com.ace.gulimall.coupon.service.CouponSpuRelationService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.util.*

/**
 * 优惠券与产品关联
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-17 14:24:23
 */
@RestController
@RequestMapping("coupon/couponspurelation")
class CouponSpuRelationController {
    @Autowired
    private lateinit var couponSpuRelationService: CouponSpuRelationService

    /**
     * 列表
     */
    @RequestMapping("/list")
    fun list(@RequestParam params: Map<String?, Any?>?): R {
        val page = couponSpuRelationService.queryPage(params)
        return R.ok().put("page", page) ?: R.error()
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    fun info(@PathVariable("id") id: Long?): R {
        val couponSpuRelation = couponSpuRelationService.getById(id)
        return R.ok().put("couponSpuRelation", couponSpuRelation) ?: R.error()
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    fun save(@RequestBody couponSpuRelation: CouponSpuRelationEntity): R {
        couponSpuRelationService.save(couponSpuRelation)
        return R.ok()
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    fun update(@RequestBody couponSpuRelation: CouponSpuRelationEntity): R {
        couponSpuRelationService.updateById(couponSpuRelation)
        return R.ok()
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    fun delete(@RequestBody ids: Array<Long?>): R {
        couponSpuRelationService.removeByIds(Arrays.asList(*ids))
        return R.ok()
    }
}