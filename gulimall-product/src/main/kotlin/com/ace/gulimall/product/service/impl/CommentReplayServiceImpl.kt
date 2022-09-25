package com.ace.gulimall.product.service.impl

import com.ace.gulimall.common.utils.PageUtils
import com.ace.gulimall.common.utils.Query
import com.ace.gulimall.product.dao.CommentReplayDao
import com.ace.gulimall.product.entity.CommentReplayEntity
import com.ace.gulimall.product.service.CommentReplayService
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import org.springframework.stereotype.Service
@Service("commentReplayService")
class CommentReplayServiceImpl : ServiceImpl<CommentReplayDao, CommentReplayEntity>(), CommentReplayService {
    override fun queryPage(params: Map<String?, Any?>?): PageUtils {
        val page = this.page(
            Query<CommentReplayEntity>().getPage(params),
            QueryWrapper()
        )
        return PageUtils(page)
    }
}