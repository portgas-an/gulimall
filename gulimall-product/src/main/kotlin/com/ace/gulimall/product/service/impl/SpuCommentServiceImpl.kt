package com.ace.gulimall.product.service.impl

import com.ace.gulimall.common.utils.PageUtils
import com.ace.gulimall.common.utils.Query
import com.ace.gulimall.product.dao.SpuCommentDao
import com.ace.gulimall.product.entity.SpuCommentEntity
import com.ace.gulimall.product.service.SpuCommentService
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import org.springframework.stereotype.Service
@Service("spuCommentService")
class SpuCommentServiceImpl : ServiceImpl<SpuCommentDao, SpuCommentEntity>(), SpuCommentService {
    override fun queryPage(params: Map<String?, Any?>?): PageUtils {
        val page = this.page(
            Query<SpuCommentEntity>().getPage(params),
            QueryWrapper()
        )
        return PageUtils(page)
    }
}