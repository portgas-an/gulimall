package com.ace.gulimall.member.service.impl

import com.ace.gulimall.member.dao.MemberLoginLogDao
import com.ace.gulimall.member.entity.MemberLoginLogEntity
import com.ace.gulimall.member.service.MemberLoginLogService
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.core.metadata.IPage
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import org.springframework.stereotype.Service

@Service("memberLoginLogService")
class MemberLoginLogServiceImpl : ServiceImpl<MemberLoginLogDao?, MemberLoginLogEntity?>(), MemberLoginLogService {
    override fun queryPage(params: Map<String?, Any?>?): PageUtils {
        val page: IPage<MemberLoginLogEntity> = this.page(
            Query<MemberLoginLogEntity>().getPage(params),
            QueryWrapper<MemberLoginLogEntity>()
        )
        return PageUtils(page)
    }
}