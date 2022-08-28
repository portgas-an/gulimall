package com.ace.gulimall.order.dao

import com.ace.gulimall.order.entity.OrderEntity
import com.baomidou.mybatisplus.core.mapper.BaseMapper
import org.apache.ibatis.annotations.Mapper

/**
 * 订单
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-17 15:30:03
 */
@Mapper
interface OrderDao : BaseMapper<OrderEntity?>