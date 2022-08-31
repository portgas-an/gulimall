package com.ace.gulimall.member.entity

import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableName
import java.io.Serializable
import java.util.*

/**
 * 会员收藏的商品
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-17 15:19:59
 */
@TableName("ums_member_collect_spu")
class MemberCollectSpuEntity : Serializable {
    /**
     * id
     */
    @TableId
     var id: Long? = null

    /**
     * 会员id
     */
     var memberId: Long? = null

    /**
     * spu_id
     */
     var spuId: Long? = null

    /**
     * spu_name
     */
     var spuName: String? = null

    /**
     * spu_img
     */
     var spuImg: String? = null

    /**
     * create_time
     */
     var createTime: Date? = null

    companion object {
        private const val serialVersionUID = 1L
    }
}