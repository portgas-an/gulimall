package com.ace.gulimall.product.entity

import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableName
import java.io.Serializable

/**
 * 商品评价回复关系
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-16 16:28:06
 */
@TableName("pms_comment_replay")
class CommentReplayEntity : Serializable {
    /**
     * id
     */
    @TableId
    var id: Long? = null

    /**
     * 评论id
     */
    var commentId: Long? = null

    /**
     * 回复id
     */
    var replyId: Long? = null

    companion object {
        private const val serialVersionUID = 1L
    }
}