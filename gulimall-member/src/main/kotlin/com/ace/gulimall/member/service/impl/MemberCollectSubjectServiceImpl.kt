package com.ace.gulimall.member.service.impl

import com.ace.gulimall.member.dao.MemberCollectSubjectDao
import com.ace.gulimall.member.entity.MemberCollectSubjectEntity
import com.ace.gulimall.member.service.MemberCollectSubjectService
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.core.metadata.IPage
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import org.springframework.stereotype.Service

@Service("memberCollectSubjectService")
class MemberCollectSubjectServiceImpl : ServiceImpl<MemberCollectSubjectDao?, MemberCollectSubjectEntity?>(),
    MemberCollectSubjectService {
    override fun queryPage(params: Map<String?, Any?>?): PageUtils {
        val page: IPage<MemberCollectSubjectEntity> = this.page(
            Query<MemberCollectSubjectEntity>().getPage(params),
            QueryWrapper<MemberCollectSubjectEntity>()
        )
        return PageUtils(page)
    }
}