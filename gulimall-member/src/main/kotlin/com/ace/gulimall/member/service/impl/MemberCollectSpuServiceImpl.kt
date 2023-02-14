package com.ace.gulimall.member.service.impl

import com.ace.gulimall.common.utils.PageUtils
import com.ace.gulimall.common.utils.Query
import com.ace.gulimall.member.dao.MemberCollectSpuDao
import com.ace.gulimall.member.entity.MemberCollectSpuEntity
import com.ace.gulimall.member.service.MemberCollectSpuService
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.core.metadata.IPage
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import org.springframework.stereotype.Service

@Service("memberCollectSpuService")
class MemberCollectSpuServiceImpl : ServiceImpl<MemberCollectSpuDao?, MemberCollectSpuEntity?>(),
    MemberCollectSpuService {
    override fun queryPage(params: Map<String?, Any?>?): PageUtils {
        val page: IPage<MemberCollectSpuEntity> = this.page(
            Query<MemberCollectSpuEntity>().getPage(params),
            QueryWrapper<MemberCollectSpuEntity>()
        )
        return PageUtils(page)
    }
}