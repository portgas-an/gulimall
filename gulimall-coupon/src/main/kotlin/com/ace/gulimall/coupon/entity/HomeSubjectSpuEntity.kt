package com.ace.gulimall.coupon.entity

import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableName
import java.io.Serializable

/**
 * 专题商品
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-17 14:24:23
 */
@TableName("sms_home_subject_spu")
class HomeSubjectSpuEntity : Serializable {
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
     * 专题id
     */
    var subjectId: Long? = null

    /**
     * spu_id
     */
    var spuId: Long? = null

    /**
     * 排序
     */
    var sort: Int? = null

    companion object {
        private const val serialVersionUID = 1L
    }
}