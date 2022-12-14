package com.ace.gulimall.order.service.impl

import com.ace.gulimall.order.dao.UndoLogDao
import com.ace.gulimall.order.entity.UndoLogEntity
import com.ace.gulimall.order.service.UndoLogService
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
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