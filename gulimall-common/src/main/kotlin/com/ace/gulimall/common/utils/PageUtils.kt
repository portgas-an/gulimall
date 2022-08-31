/**
 * Copyright (c) 2016-2019 人人开源 All rights reserved.
 *
 * https://www.renren.io
 *
 * 版权所有，侵权必究！
 */
package com.ace.gulimall.common.utils

import com.baomidou.mybatisplus.core.metadata.IPage

/**
 * 分页工具类
 *
 * @author Mark sunlightcs@gmail.com
 */
class PageUtils : Serializable {
    /**
     * 总记录数
     */
    var totalCount: Int

    /**
     * 每页记录数
     */
    var pageSize: Int

    /**
     * 总页数
     */
    var totalPage: Int

    /**
     * 当前页数
     */
    var currPage: Int

    /**
     * 列表数据
     */
    var list: List<*>

    /**
     * 分页
     * @param list        列表数据
     * @param totalCount  总记录数
     * @param pageSize    每页记录数
     * @param currPage    当前页数
     */
    constructor(list: List<*>, totalCount: Int, pageSize: Int, currPage: Int) {
        this.list = list
        this.totalCount = totalCount
        this.pageSize = pageSize
        this.currPage = currPage
        totalPage = Math.ceil(totalCount.toDouble() / pageSize)
    }

    /**
     * 分页
     */
    constructor(page: IPage<*>) {
        list = page.getRecords()
        totalCount = page.getTotal()
        pageSize = page.getSize()
        currPage = page.getCurrent()
        totalPage = page.getPages()
    }

    companion object {
        private const val serialVersionUID = 1L
    }
}