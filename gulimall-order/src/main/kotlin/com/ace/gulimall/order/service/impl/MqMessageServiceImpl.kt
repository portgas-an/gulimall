package com.ace.gulimall.order.service.impl

import com.ace.gulimall.order.dao.MqMessageDao
import com.ace.gulimall.order.entity.MqMessageEntity
import com.ace.gulimall.order.service.MqMessageService
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import org.springframework.stereotype.Service

@Service("mqMessageService")
class MqMessageServiceImpl : ServiceImpl<MqMessageDao?, MqMessageEntity?>(), MqMessageService {
    override fun queryPage(params: Map<String?, Any?>?): PageUtils {
        val page = this.page(
            Query<MqMessageEntity>().getPage(params),
            QueryWrapper()
        )
        return PageUtils(page)
    }
}