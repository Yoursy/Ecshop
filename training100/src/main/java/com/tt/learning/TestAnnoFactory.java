package com.tt.learning;

import java.lang.reflect.Proxy;

public class TestAnnoFactory    //创建一个页面工厂，将代理封装起来
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
