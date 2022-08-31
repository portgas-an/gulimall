package com.ace.gulimall.member.service

import com.ace.gulimall.member.entity.MemberReceiveAddressEntity
import com.baomidou.mybatisplus.extension.service.IService

/**
 * 会员收货地址
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-17 15:19:59
 */
interface MemberReceiveAddressService : IService<MemberReceiveAddressEntity?> {
    fun queryPage(params: Map<String?, Any?>?): PageUtils
}