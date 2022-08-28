package com.ace.gulimall.member.service

import com.ace.gulimall.member.entity.MemberLevelEntity
import com.baomidou.mybatisplus.extension.service.IService
import com.ace.gulimall.common.utils.PageUtils

/**
 * 会员等级
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-17 15:19:59
 */
interface MemberLevelService : IService<MemberLevelEntity?> {
    fun queryPage(params: Map<String?, Any?>?): PageUtils
}