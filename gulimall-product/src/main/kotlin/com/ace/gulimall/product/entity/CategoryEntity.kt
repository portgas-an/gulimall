package com.ace.gulimall.product.entity

import com.baomidou.mybatisplus.annotation.TableField
import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableLogic
import com.baomidou.mybatisplus.annotation.TableName
import com.fasterxml.jackson.annotation.JsonInclude
import java.io.Serializable

/**
 * 商品三级分类
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-16 16:28:06
 */
@TableName("pms_category")
class CategoryEntity : Serializable {
    /**
     * 分类id
     */
    @TableId
    var catId: Long? = null

    /**
     * 分类名称
     */
    var name: String? = null

    /**
     * 父分类id
     */
    var parentCid: Long? = null

    /**
     * 层级
     */
    var catLevel: Int? = null

    /**
     * 是否显示[0-不显示，1显示]
     */
    @TableLogic(value = "1", delval = "0")
    var showStatus: Int? = null

    /**
     * 排序
     */
    var sort: Int? = null

    /**
     * 图标地址
     */
    var icon: String? = null

    /**
     * 计量单位
     */
    var productUnit: String? = null

    /**
     * 商品数量
     */
    var productCount: Int? = null

    /**
     * 查出来的数据后设置的子列表
     */
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @TableField(exist = false)
    var children:List<CategoryEntity>? = null

    companion object {
        private const val serialVersionUID = 1L
    }
}