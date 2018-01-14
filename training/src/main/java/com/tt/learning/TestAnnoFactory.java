package com.tt.learning;

import java.lang.reflect.Proxy;

public class TestAnnoFactory    //����һ��ҳ�湤�����������װ����
{
	public static ITestAnno build()
	{
		ITestAnno ta = (ITestAnno)Proxy.newProxyInstance(
				ITestAnno.class.getClassLoader(),
				new Class[]{ITestAnno.class},
				new TestAnnoInvocationHeandler());
		return ta;
	}	
}
