package com.ace.gulimall.coupon.entity

import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableName
import java.io.Serializable

/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-17 14:24:23
 */
@TableName("sms_home_subject")
class HomeSubjectEntity : Serializable {
    /**
     * id
     */
    @TableId
    var id: Long? = null

    /**
     * 专题名字
     */
    var name: String? = null

    /**
     * 专题标题
     */
    var title: String? = null

    /**
     * 专题副标题
     */
    var subTitle: String? = null

    /**
     * 显示状态
     */
    var status: Int? = null

    /**
     * 详情连接
     */
    var url: String? = null

    /**
     * 排序
     */
    var sort: Int? = null

    /**
     * 专题图片地址
     */
    var img: String? = null

    companion object {
        private const val serialVersionUID = 1L
    }
}