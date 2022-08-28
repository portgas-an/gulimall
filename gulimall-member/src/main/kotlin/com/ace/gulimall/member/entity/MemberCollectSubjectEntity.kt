package com.ace.gulimall.member.entity

import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableName
import java.io.Serializable

/**
 * 会员收藏的专题活动
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-17 15:19:59
 */
@TableName("ums_member_collect_subject")
class MemberCollectSubjectEntity : Serializable {
    /**
     * id
     */
    @TableId
    private val id: Long? = null

    /**
     * subject_id
     */
    private val subjectId: Long? = null

    /**
     * subject_name
     */
    private val subjectName: String? = null

    /**
     * subject_img
     */
    private val subjectImg: String? = null

    /**
     * 活动url
     */
    private val subjectUrll: String? = null

    companion object {
        private const val serialVersionUID = 1L
    }
}