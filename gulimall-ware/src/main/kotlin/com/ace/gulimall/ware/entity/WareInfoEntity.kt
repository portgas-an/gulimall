package com.ace.gulimall.ware.entity

import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableName
import java.io.Serializable

/**
 * 仓库信息
 *
 * @author yeswater
 * @email ruobairuo@gmail.com
 * @date 2021-07-17 15:34:08
 */
@TableName("wms_ware_info")
class WareInfoEntity : Serializable {
    /**
     * id
     */
    @TableId
    var id: Long? = null

    /**
     * 仓库名
     */
    var name: String? = null

    /**
     * 仓库地址
     */
    var address: String? = null

    /**
     * 区域编码
     */
    var areacode: String? = null

    companion object {
        private const val serialVersionUID = 1L
    }
}