package com.ace.gulimall.ware.service.impl

import com.ace.gulimall.ware.dao.WareOrderTaskDetailDao
import com.ace.gulimall.ware.entity.WareOrderTaskDetailEntity
import com.ace.gulimall.ware.service.WareOrderTaskDetailService
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import org.springframework.stereotype.Service

@Service("wareOrderTaskDetailService")
class WareOrderTaskDetailServiceImpl : ServiceImpl<WareOrderTaskDetailDao?, WareOrderTaskDetailEntity?>(),
    WareOrderTaskDetailService {
    override fun queryPage(params: Map<String?, Any?>?): PageUtils {
        val page = this.page(
            Query<WareOrderTaskDetailEntity>().getPage(params),
            QueryWrapper()
        )
        return PageUtils(page)
    }
}