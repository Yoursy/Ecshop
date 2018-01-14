package com.tt.learning;

import java.lang.reflect.Method;

public class RunAnno
{
	//使用java的反射机制，通过类对象获取到类方法，通过类方法获取的其他类

	public static void main(String[] args) throws Exception, SecurityException
	{
		
		TestAnno ta = new TestAnno();
		Method method = TestAnno.class.getDeclaredMethod("sayHi");
		RunTime rt = method.getAnnotation(RunTime.class);//通过method反射去获取注解类
		int count = rt.count();//获取count属性		
		for(int i = 0; i < count ; i++)
		{
			//执行method
			method.invoke(ta);
		}
		
	}
}
