package com.tt.learning;

public class DemoTest
{
	
	public static class Test{
		public String str;		
		public Test()
		{
			System.out.println("����������");
		}
		public String getString()
		{
			str = "��ȡ�������Str";
			return str;
		}
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		DemoTest dt = new DemoTest();
		Test t = new DemoTest.Test();
		System.out.println(t.getString());
	}

}
