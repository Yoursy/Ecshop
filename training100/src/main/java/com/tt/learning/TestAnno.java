package com.tt.learning;
public class TestAnno implements ITestAnno
{
	@Override
	@RunTime(count = 10)  //使用在方法前面的注解，设置count的值为10
	public void sayHi()
	{
		System.out.println("Hi");
	}	
}
