package com.ace.gulimall.product.service.impl

import com.ace.gulimall.common.utils.PageUtils
import com.ace.gulimall.common.utils.Query
import com.ace.gulimall.product.dao.AttrGroupDao
import com.ace.gulimall.product.entity.AttrGroupEntity
import com.ace.gulimall.product.service.AttrGroupService
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import org.springframework.stereotype.Service
@Service("attrGroupService")
class AttrGroupServiceImpl : ServiceImpl<AttrGroupDao, AttrGroupEntity>(), AttrGroupService {
    override fun queryPage(params: Map<String, Any>): PageUtils {
        val page = this.page(
            Query<AttrGroupEntity>().getPage(params),
            QueryWrapper()
        )
        return PageUtils(page)
    }

    override fun queryPage(params: Map<String, Any>, catelogId: Long): PageUtils {
        var key = params["key"] as String?
        // select * from pms_attr_group where catelog_Id = ? and (attr_group_id = key or attr_group_name like %key%)
        val wrapper = QueryWrapper<AttrGroupEntity>()
        if (key?.isNotEmpty() == true) {
            wrapper.and {
                it.eq("attr_group_id", key).or().like("attr_group_name", key)
            }
        }
        val page = if (catelogId == 0L) {
            this.page(Query<AttrGroupEntity>().getPage(params), wrapper)
        } else {
            wrapper.eq("catelog_Id", catelogId)
            this.page(Query<AttrGroupEntity>().getPage(params), wrapper)
        }
        return PageUtils(page)
    }
}