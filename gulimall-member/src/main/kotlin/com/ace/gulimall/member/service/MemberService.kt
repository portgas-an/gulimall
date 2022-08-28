package com.ace.gulimall.member.service

import com.ace.gulimall.member.entity.MemberEntity
import com.baomidou.mybatisplus.extension.service.IService
import com.ace.gulimall.common.utils.PageUtils

/**
 * 会员
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-17 15:19:59
 */
interface MemberService : IService<MemberEntity?> {
    fun queryPage(params: Map<String?, Any?>?): PageUtils
}