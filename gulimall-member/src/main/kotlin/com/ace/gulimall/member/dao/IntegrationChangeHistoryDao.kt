package com.ace.gulimall.member.dao

import com.ace.gulimall.member.entity.IntegrationChangeHistoryEntity
import com.baomidou.mybatisplus.core.mapper.BaseMapper
import org.apache.ibatis.annotations.Mapper

/**
 * 积分变化历史记录
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-17 15:19:59
 */
@Mapper
interface IntegrationChangeHistoryDao : BaseMapper<IntegrationChangeHistoryEntity?>