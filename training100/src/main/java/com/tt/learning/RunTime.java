package com.tt.learning;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Retention(RUNTIME)//表明annotation在运行时才生效
@Target(METHOD)//表明annotation使用在方法前
public @interface RunTime
{
	public int count() default 1;  //定义一个属性（注解）
	
}
