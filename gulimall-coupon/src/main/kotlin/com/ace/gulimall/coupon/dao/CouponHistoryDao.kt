package com.ace.gulimall.coupon.dao

import com.ace.gulimall.coupon.entity.CouponHistoryEntity
import com.baomidou.mybatisplus.core.mapper.BaseMapper
import org.apache.ibatis.annotations.Mapper

/**
 * 优惠券领取历史记录
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-17 14:24:23
 */
@Mapper
interface CouponHistoryDao : BaseMapper<CouponHistoryEntity?>