package com.ttPageObject.learning;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class InvockTestFindElementHandler implements InvocationHandler //invocationhandler是一个接口
{
	@Override
	public Object invoke(Object obj, Method method, Object[] objs) throws Throwable
	{
		// 在这个方法里，做一些获取注解的操作
		ITestFindElement itf = new TestFindElememnt();//实例化接口			
		Anno a = method.getDeclaredAnnotation(Anno.class);
		int count = a.count();
		for(int i = 0; i < count; i++)
		{
			obj = method.invoke(itf);
		}
		return obj;
	}
}
