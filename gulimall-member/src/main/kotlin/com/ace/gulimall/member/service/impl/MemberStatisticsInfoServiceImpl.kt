package com.ace.gulimall.member.service.impl

import com.ace.gulimall.member.dao.MemberStatisticsInfoDao
import com.ace.gulimall.member.entity.MemberStatisticsInfoEntity
import com.ace.gulimall.member.service.MemberStatisticsInfoService
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.core.metadata.IPage
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import org.springframework.stereotype.Service

@Service("memberStatisticsInfoService")
class MemberStatisticsInfoServiceImpl : ServiceImpl<MemberStatisticsInfoDao?, MemberStatisticsInfoEntity?>(),
    MemberStatisticsInfoService {
    override fun queryPage(params: Map<String?, Any?>?): PageUtils {
        val page: IPage<MemberStatisticsInfoEntity> = this.page(
            Query<MemberStatisticsInfoEntity>().getPage(params),
            QueryWrapper<MemberStatisticsInfoEntity>()
        )
        return PageUtils(page)
    }
}