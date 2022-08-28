package com.ace.gulimall.coupon.controller

import com.ace.gulimall.common.utils.R
import com.ace.gulimall.coupon.entity.CouponSpuCategoryRelationEntity
import com.ace.gulimall.coupon.service.CouponSpuCategoryRelationService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.util.*

/**
 * 优惠券分类关联
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-17 14:24:23
 */
@RestController
@RequestMapping("coupon/couponspucategoryrelation")
class CouponSpuCategoryRelationController {
    @Autowired
    private lateinit var couponSpuCategoryRelationService: CouponSpuCategoryRelationService

    /**
     * 列表
     */
    @RequestMapping("/list")
    fun list(@RequestParam params: Map<String?, Any?>?): R {
        val page = couponSpuCategoryRelationService.queryPage(params)
        return R.ok().put("page", page) ?: R.error()
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    fun info(@PathVariable("id") id: Long?): R {
        val couponSpuCategoryRelation = couponSpuCategoryRelationService.getById(id)
        return R.ok().put("couponSpuCategoryRelation", couponSpuCategoryRelation) ?: R.error()
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    fun save(@RequestBody couponSpuCategoryRelation: CouponSpuCategoryRelationEntity): R {
        couponSpuCategoryRelationService.save(couponSpuCategoryRelation)
        return R.ok()
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    fun update(@RequestBody couponSpuCategoryRelation: CouponSpuCategoryRelationEntity): R {
        couponSpuCategoryRelationService.updateById(couponSpuCategoryRelation)
        return R.ok()
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    fun delete(@RequestBody ids: Array<Long?>): R {
        couponSpuCategoryRelationService.removeByIds(Arrays.asList(*ids))
        return R.ok()
    }
}