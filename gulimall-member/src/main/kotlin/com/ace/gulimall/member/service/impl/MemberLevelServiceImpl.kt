package com.ace.gulimall.member.service.impl

import com.ace.gulimall.common.utils.PageUtils
import com.ace.gulimall.common.utils.Query
import com.ace.gulimall.member.dao.MemberLevelDao
import com.ace.gulimall.member.entity.MemberLevelEntity
import com.ace.gulimall.member.service.MemberLevelService
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.core.metadata.IPage
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import org.springframework.stereotype.Service

@Service("memberLevelService")
class MemberLevelServiceImpl : ServiceImpl<MemberLevelDao?, MemberLevelEntity?>(), MemberLevelService {
    override fun queryPage(params: Map<String?, Any?>?): PageUtils {
        val page: IPage<MemberLevelEntity> = this.page(
            Query<MemberLevelEntity>().getPage(params),
            QueryWrapper<MemberLevelEntity>()
        )
        return PageUtils(page)
    }
}