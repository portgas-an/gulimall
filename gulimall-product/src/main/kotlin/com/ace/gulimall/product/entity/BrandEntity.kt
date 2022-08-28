package com.ace.gulimall.product.entity

import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableName
import java.io.Serializable

/**
 * 品牌
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-16 16:28:06
 */
@TableName("pms_brand")
class BrandEntity : Serializable {
    /**
     * 品牌id
     */
    @TableId
    var brandId: Long? = null

    /**
     * 品牌名
     */
    var name: String? = null

    /**
     * 品牌logo地址
     */
    var logo: String? = null

    /**
     * 介绍
     */
    var descript: String? = null

    /**
     * 显示状态[0-不显示；1-显示]
     */
    var showStatus: Int? = null

    /**
     * 检索首字母
     */
    var firstLetter: String? = null

    /**
     * 排序
     */
    var sort: Int? = null

    companion object {
        private const val serialVersionUID = 1L
    }
}