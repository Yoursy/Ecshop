package com.ttPageObject.learning;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class InvockTestFindElementHandler implements InvocationHandler //invocationhandler��һ���ӿ�
{
	@Override
	public Object invoke(Object obj, Method method, Object[] objs) throws Throwable
	{
		// ������������һЩ��ȡע��Ĳ���
		ITestFindElement itf = new TestFindElememnt();//ʵ�����ӿ�			
		Anno a = method.getDeclaredAnnotation(Anno.class);
		int count = a.count();
		for(int i = 0; i < count; i++)
		{
			obj = method.invoke(itf);
		}
		return obj;
	}
}
