package com.ace.gulimall.member.dao

import com.ace.gulimall.member.entity.GrowthChangeHistoryEntity
import com.baomidou.mybatisplus.core.mapper.BaseMapper
import org.apache.ibatis.annotations.Mapper

/**
 * 成长值变化历史记录
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-17 15:19:59
 */
@Mapper
interface GrowthChangeHistoryDao : BaseMapper<GrowthChangeHistoryEntity?>