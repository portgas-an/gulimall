package com.ace.gulimall.member.service.impl

import com.ace.gulimall.common.utils.PageUtils
import com.ace.gulimall.common.utils.Query
import com.ace.gulimall.member.dao.UndoLogDao
import com.ace.gulimall.member.entity.UndoLogEntity
import com.ace.gulimall.member.service.UndoLogService
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.core.metadata.IPage
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import org.springframework.stereotype.Service

@Service("undoLogService")
class UndoLogServiceImpl : ServiceImpl<UndoLogDao?, UndoLogEntity?>(), UndoLogService {
    override fun queryPage(params: Map<String?, Any?>?): PageUtils {
        val page: IPage<UndoLogEntity> = this.page(
            Query<UndoLogEntity>().getPage(params),
            QueryWrapper<UndoLogEntity>()
        )
        return PageUtils(page)
    }
}