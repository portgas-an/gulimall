package com.ace.gulimall.product.entity

import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableName
import java.io.Serializable
import java.util.*

/**
 * 商品评价
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-16 16:28:06
 */
@TableName("pms_spu_comment")
class SpuCommentEntity : Serializable {
    /**
     * id
     */
    @TableId
    var id: Long? = null

    /**
     * sku_id
     */
    var skuId: Long? = null

    /**
     * spu_id
     */
    var spuId: Long? = null

    /**
     * 商品名字
     */
    var spuName: String? = null

    /**
     * 会员昵称
     */
    var memberNickName: String? = null

    /**
     * 星级
     */
    var star: Int? = null

    /**
     * 会员ip
     */
    var memberIp: String? = null

    /**
     * 创建时间
     */
    var createTime: Date? = null

    /**
     * 显示状态[0-不显示，1-显示]
     */
    var showStatus: Int? = null

    /**
     * 购买时属性组合
     */
    var spuAttributes: String? = null

    /**
     * 点赞数
     */
    var likesCount: Int? = null

    /**
     * 回复数
     */
    var replyCount: Int? = null

    /**
     * 评论图片/视频[json数据；[{type:文件类型,url:资源路径}]]
     */
    var resources: String? = null

    /**
     * 内容
     */
    var content: String? = null

    /**
     * 用户头像
     */
    var memberIcon: String? = null

    /**
     * 评论类型[0 - 对商品的直接评论，1 - 对评论的回复]
     */
    var commentType: Int? = null

    companion object {
        private const val serialVersionUID = 1L
    }
}