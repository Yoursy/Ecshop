package com.ttPageObject.learning;

import java.lang.reflect.Proxy;

//使用代理模式来查找元素
public class RunProxyFindElement
{
	public static void main(String[] args)
	{
		PageFactoryFindElements pf = new PageFactoryFindElements();
		pf.pageFactoryFindElements();
	}
}
