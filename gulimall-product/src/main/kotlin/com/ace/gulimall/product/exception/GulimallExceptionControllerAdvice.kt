package com.ace.gulimall.product.exception

import com.ace.gulimall.common.utils.R
import org.springframework.web.bind.MethodArgumentNotValidException
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice

@RestControllerAdvice(basePackages = ["com.ace.gulimall.product.controller"])
class GulimallExceptionControllerAdvice {

    @ExceptionHandler(value = [MethodArgumentNotValidException::class])
    fun handleValidException(e: MethodArgumentNotValidException): R {
        print("数据校验出问题${e.message},异常类型${e.javaClass}")
        val errorMap = e.bindingResult.fieldErrors.associate {
            Pair(it.field, it.defaultMessage ?: "")
        }
        return R.error(400, "数据校验失败").put("data", errorMap)
    }

    @ExceptionHandler(value = [Throwable::class])
    fun handleException(throwable: Throwable) : R {
        print("数据校验出问题${throwable.message},异常类型${throwable.javaClass}")
        return R.error()
    }

}