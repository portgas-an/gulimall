package com.ace.gulimall.member.service.impl

import com.ace.gulimall.member.dao.MemberReceiveAddressDao
import com.ace.gulimall.member.entity.MemberReceiveAddressEntity
import com.ace.gulimall.member.service.MemberReceiveAddressService
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.core.metadata.IPage
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import org.springframework.stereotype.Service

@Service("memberReceiveAddressService")
class MemberReceiveAddressServiceImpl : ServiceImpl<MemberReceiveAddressDao?, MemberReceiveAddressEntity?>(),
    MemberReceiveAddressService {
    override fun queryPage(params: Map<String?, Any?>?): PageUtils {
        val page: IPage<MemberReceiveAddressEntity> = this.page(
            Query<MemberReceiveAddressEntity>().getPage(params),
            QueryWrapper<MemberReceiveAddressEntity>()
        )
        return PageUtils(page)
    }
}