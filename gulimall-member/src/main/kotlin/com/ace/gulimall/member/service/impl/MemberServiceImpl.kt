package com.ace.gulimall.member.service.impl

import com.ace.gulimall.common.utils.PageUtils
import com.ace.gulimall.common.utils.Query
import com.ace.gulimall.member.dao.MemberDao
import com.ace.gulimall.member.entity.MemberEntity
import com.ace.gulimall.member.service.MemberService
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.core.metadata.IPage
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import org.springframework.stereotype.Service

@Service("memberService")
class MemberServiceImpl : ServiceImpl<MemberDao?, MemberEntity?>(), MemberService {
    override fun queryPage(params: Map<String?, Any?>?): PageUtils {
        val page: IPage<MemberEntity> = this.page(
            Query<MemberEntity>().getPage(params),
            QueryWrapper<MemberEntity>()
        )
        return PageUtils(page)
    }
}