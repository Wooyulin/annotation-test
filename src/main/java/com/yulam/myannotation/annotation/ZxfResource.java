package com.yulam.myannotation.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author: 5yl
 * email: massyulin@gmail.com
 * time : 2018/1/24 下午10:49
 */

// 在运行时执行
@Retention(RetentionPolicy.RUNTIME)
// 注解适用地方(字段和方法)
@Target({ ElementType.FIELD, ElementType.METHOD })
public @interface ZxfResource {

    //注解的name属性
    public String name() default "";
}