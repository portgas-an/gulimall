package com.ace.gulimall.ware.service.impl

import com.ace.gulimall.ware.dao.WareOrderTaskDao
import com.ace.gulimall.ware.entity.WareOrderTaskEntity
import com.ace.gulimall.ware.service.WareOrderTaskService
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import org.springframework.stereotype.Service

@Service("wareOrderTaskService")
class WareOrderTaskServiceImpl : ServiceImpl<WareOrderTaskDao?, WareOrderTaskEntity?>(), WareOrderTaskService {
    override fun queryPage(params: Map<String?, Any?>?): PageUtils {
        val page = this.page(
            Query<WareOrderTaskEntity>().getPage(params),
            QueryWrapper()
        )
        return PageUtils(page)
    }
}