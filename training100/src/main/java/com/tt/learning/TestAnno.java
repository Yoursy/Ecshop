package com.tt.learning;
public class TestAnno implements ITestAnno
{
	@Override
	@RunTime(count = 10)  //ʹ���ڷ���ǰ���ע�⣬����count��ֵΪ10
	public void sayHi()
	{
		System.out.println("Hi");
	}	
}
