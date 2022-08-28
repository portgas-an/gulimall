package com.ace.gulimall.coupon.dao

import com.ace.gulimall.coupon.entity.MemberPriceEntity
import com.baomidou.mybatisplus.core.mapper.BaseMapper
import org.apache.ibatis.annotations.Mapper

/**
 * 商品会员价格
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-17 14:24:23
 */
@Mapper
interface MemberPriceDao : BaseMapper<MemberPriceEntity?>