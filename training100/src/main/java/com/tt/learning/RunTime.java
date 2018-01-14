package com.tt.learning;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Retention(RUNTIME)//����annotation������ʱ����Ч
@Target(METHOD)//����annotationʹ���ڷ���ǰ
public @interface RunTime
{
	public int count() default 1;  //����һ�����ԣ�ע�⣩
	
}
