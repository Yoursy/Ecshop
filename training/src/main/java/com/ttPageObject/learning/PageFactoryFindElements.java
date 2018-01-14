package com.ttPageObject.learning;

import java.lang.reflect.Proxy;

public class PageFactoryFindElements
{
	public void pageFactoryFindElements()
	{
		ITestFindElement proxy = (ITestFindElement)Proxy.newProxyInstance(
				TestFindElememnt.class.getClassLoader(),
				new Class[]{ITestFindElement.class},
				new InvockTestFindElementHandler());
		try
		{
			proxy.findElement_and_click();
		} catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
