package com.tt.learning;
import java.lang.reflect.Proxy;

//该类实现执行代理的功能
//
public class RunProxyDemo
{
	public static void main(String[] args)
	{
		ITestAnno ta = TestAnnoFactory.build();//通过代理工厂创建接口实例
		ta.sayHi();   //ta直接执行sayHi方法
	}	
}