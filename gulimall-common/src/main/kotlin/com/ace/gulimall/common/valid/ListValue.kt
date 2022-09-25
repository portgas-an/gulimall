package com.ace.gulimall.common.valid

import java.lang.annotation.Documented
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy
import javax.validation.Constraint
import javax.validation.Payload
import kotlin.reflect.KClass

@Documented
@Constraint(validatedBy = [
    ListValueConstrainValidator::class
])
@Target(
    AnnotationTarget.FUNCTION,
    AnnotationTarget.PROPERTY_GETTER,
    AnnotationTarget.PROPERTY_SETTER,
    AnnotationTarget.FIELD,
    AnnotationTarget.ANNOTATION_CLASS,
    AnnotationTarget.CONSTRUCTOR,
    AnnotationTarget.VALUE_PARAMETER,
)
@Retention(
    RetentionPolicy.RUNTIME
)
annotation class ListValue(
    val message: String = "{ com.ace.gulimall.common.valid.ListValue.message }",
    val groups: Array<KClass<*>> = [],
    val payload: Array<KClass<out Payload>> = [],
    vararg val value: Int = []
)