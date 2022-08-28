package com.ace.gulimall.product.entity

import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableName

import java.io.Serializable


@TableName("pms_attr_attrgroup_relation")
class AttrAttrgroupRelationEntity : Serializable {
    /**
     * id
     */
    @TableId
    var id: Long? = null

    /**
     * 属性id
     */
    var attrId: Long? = null

    /**
     * 属性分组id
     */
    var attrGroupId: Long? = null

    /**
     * 属性组内排序
     */
    var attrSort: Int? = null

    companion object {
        private const val serialVersionUID = 1L
    }
}