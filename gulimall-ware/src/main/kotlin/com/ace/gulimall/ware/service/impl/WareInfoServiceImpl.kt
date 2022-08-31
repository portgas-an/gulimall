package com.ace.gulimall.ware.service.impl

import com.ace.gulimall.ware.dao.WareInfoDao
import com.ace.gulimall.ware.entity.WareInfoEntity
import com.ace.gulimall.ware.service.WareInfoService
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import org.springframework.stereotype.Service

@Service("wareInfoService")
class WareInfoServiceImpl : ServiceImpl<WareInfoDao?, WareInfoEntity?>(), WareInfoService {
    override fun queryPage(params: Map<String?, Any?>?): PageUtils {
        val page = this.page(
            Query<WareInfoEntity>().getPage(params),
            QueryWrapper()
        )
        return PageUtils(page)
    }
}