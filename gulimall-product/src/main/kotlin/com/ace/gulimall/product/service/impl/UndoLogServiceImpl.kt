package com.ace.gulimall.product.service.impl

import com.ace.gulimall.product.dao.UndoLogDao
import com.ace.gulimall.product.entity.UndoLogEntity
import com.ace.gulimall.product.service.UndoLogService
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import com.ace.gulimall.common.utils.PageUtils
import com.ace.gulimall.common.utils.Query
import org.springframework.stereotype.Service

@Service("undoLogService")
class UndoLogServiceImpl : ServiceImpl<UndoLogDao?, UndoLogEntity?>(), UndoLogService {
    override fun queryPage(params: Map<String?, Any?>?): PageUtils {
        val page = this.page(
            Query<UndoLogEntity>().getPage(params),
            QueryWrapper()
        )
        return PageUtils(page)
    }
}