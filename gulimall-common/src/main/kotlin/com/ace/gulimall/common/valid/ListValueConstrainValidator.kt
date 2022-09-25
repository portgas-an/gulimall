package com.ace.gulimall.common.valid

import javax.validation.ConstraintValidator
import javax.validation.ConstraintValidatorContext

class ListValueConstrainValidator : ConstraintValidator<ListValue, Int> {

    private val set = mutableSetOf<Int>()

    override fun initialize(constraintAnnotation: ListValue?) {
        super.initialize(constraintAnnotation)
        constraintAnnotation?.value?.forEach {
            set.add(it)
        }

    }

    /**
     * 判断是否校验成功
     */
    override fun isValid(value: Int?, p1: ConstraintValidatorContext?): Boolean {
        return set.contains(value)
    }
}