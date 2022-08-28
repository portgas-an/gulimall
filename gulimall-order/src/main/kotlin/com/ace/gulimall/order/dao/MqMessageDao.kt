package com.ace.gulimall.order.dao

import com.ace.gulimall.order.entity.MqMessageEntity
import com.baomidou.mybatisplus.core.mapper.BaseMapper
import org.apache.ibatis.annotations.Mapper

/**
 *
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-17 15:30:03
 */
@Mapper
interface MqMessageDao : BaseMapper<MqMessageEntity?>