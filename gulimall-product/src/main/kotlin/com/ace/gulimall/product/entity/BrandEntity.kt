package com.ace.gulimall.product.entity

import com.ace.gulimall.common.valid.AddGroup
import com.ace.gulimall.common.valid.ListValue
import com.ace.gulimall.common.valid.UpdateGroup
import com.ace.gulimall.common.valid.UpdateStatusGroup
import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableName
import org.hibernate.validator.constraints.URL
import java.io.Serializable
import javax.validation.constraints.*

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
    @NotNull(message = "修改必须指定id", groups = [UpdateGroup::class, UpdateStatusGroup::class])
    @Null(message = "新增不能指定id", groups = [AddGroup::class])
    @TableId
    var brandId: Long? = null

    /**
     * 品牌名
     */
    @NotBlank(message = "品牌必须提交", groups = [UpdateGroup::class, AddGroup::class])
    var name: String? = null

    /**
     * 品牌logo地址
     */
    @NotEmpty(groups = [AddGroup::class])
    @URL(message = "logo必须是一个合法的url地址", groups = [UpdateGroup::class, AddGroup::class])
    var logo: String? = null

    /**
     * 介绍
     */
    var descript: String? = null

    /**
     * 显示状态[0-不显示；1-显示]
     */
    @NotNull(groups = [AddGroup::class, UpdateStatusGroup::class])
    @ListValue(value = [0, 1], message = "参数必须0或1", groups = [AddGroup::class, UpdateStatusGroup::class])
    var showStatus: Int? = null

    /**
     * 检索首字母
     */
    @NotEmpty(groups = [AddGroup::class])
    @Pattern(regexp = "^[a-zA-Z]$", message = "检索首字母必须是一个字母", groups = [UpdateGroup::class, AddGroup::class])
    var firstLetter: String? = null

    /**
     * 排序
     */
    @NotNull(groups = [AddGroup::class])
    @Min(value = 0, message = "排序大于等于0", groups = [UpdateGroup::class, AddGroup::class])
    var sort: Int? = null

    companion object {
        private const val serialVersionUID = 1L
    }
}