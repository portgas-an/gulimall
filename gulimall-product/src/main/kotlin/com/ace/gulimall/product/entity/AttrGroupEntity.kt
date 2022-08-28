package com.ace.gulimall.product.entity

import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableName
import java.io.Serializable

/**
 * 属性分组
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-16 16:28:06
 */
@TableName("pms_attr_group")
class AttrGroupEntity : Serializable {
    /**
     * 分组id
     */
    @TableId
    var attrGroupId: Long? = null

    /**
     * 组名
     */
    var attrGroupName: String? = null

    /**
     * 排序
     */
    var sort: Int? = null

    /**
     * 描述
     */
    var descript: String? = null

    /**
     * 组图标
     */
    var icon: String? = null

    /**
     * 所属分类id
     */
    var catelogId: Long? = null

    companion object {
        private const val serialVersionUID = 1L
    }
}