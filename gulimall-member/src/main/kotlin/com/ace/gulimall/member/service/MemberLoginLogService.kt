package com.ace.gulimall.member.service

import com.ace.gulimall.common.utils.PageUtils
import com.ace.gulimall.member.entity.MemberLoginLogEntity
import com.baomidou.mybatisplus.extension.service.IService

/**
 * 会员登录记录
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-17 15:19:59
 */
interface MemberLoginLogService : IService<MemberLoginLogEntity?> {
    fun queryPage(params: Map<String?, Any?>?): PageUtils
}