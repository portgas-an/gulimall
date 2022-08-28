package com.ace.gulimall.product.dao

import com.ace.gulimall.product.entity.CommentReplayEntity
import com.baomidou.mybatisplus.core.mapper.BaseMapper
import org.apache.ibatis.annotations.Mapper

/**
 * 商品评价回复关系
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-16 16:28:06
 */
@Mapper
interface CommentReplayDao : BaseMapper<CommentReplayEntity?>