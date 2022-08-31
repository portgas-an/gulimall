/**
 * Copyright (c) 2016-2019 人人开源 All rights reserved.
 *
 * https://www.renren.io
 *
 * 版权所有，侵权必究！
 */
package com.ace.gulimall.common.xss

import com.ace.gulimall.common.exception.RRException

/**
 * SQL过滤
 *
 * @author Mark sunlightcs@gmail.com
 */
object SQLFilter {
    /**
     * SQL注入过滤
     * @param str  待验证的字符串
     */
    fun sqlInject(str: String): String? {
        var str = str
        if (StringUtils.isBlank(str)) {
            return null
        }
        //去掉'|"|;|\字符
        str = StringUtils.replace(str, "'", "")
        str = StringUtils.replace(str, "\"", "")
        str = StringUtils.replace(str, ";", "")
        str = StringUtils.replace(str, "\\", "")

        //转换成小写
        str = str.toLowerCase()

        //非法字符
        val keywords = arrayOf("master", "truncate", "insert", "select", "delete", "update", "declare", "alter", "drop")

        //判断是否包含非法字符
        for (keyword in keywords) {
            if (str.indexOf(keyword) !== -1) {
                throw RRException("包含非法字符")
            }
        }
        return str
    }
}