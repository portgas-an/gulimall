package com.ace.gulimall.member.service

import com.ace.gulimall.member.entity.MemberCollectSpuEntity
import com.baomidou.mybatisplus.extension.service.IService

/**
 * 会员收藏的商品
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-17 15:19:59
 */
interface MemberCollectSpuService : IService<MemberCollectSpuEntity?> {
    fun queryPage(params: Map<String?, Any?>?): PageUtils
}