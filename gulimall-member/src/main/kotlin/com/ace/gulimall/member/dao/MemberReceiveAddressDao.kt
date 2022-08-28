package com.ace.gulimall.member.dao

import com.ace.gulimall.member.entity.MemberReceiveAddressEntity
import com.baomidou.mybatisplus.core.mapper.BaseMapper
import org.apache.ibatis.annotations.Mapper

/**
 * 会员收货地址
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-17 15:19:59
 */
@Mapper
interface MemberReceiveAddressDao : BaseMapper<MemberReceiveAddressEntity?>