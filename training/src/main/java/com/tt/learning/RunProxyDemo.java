package com.tt.learning;
import java.lang.reflect.Proxy;

//����ʵ��ִ�д���Ĺ���
//
public class RunProxyDemo
{
	public static void main(String[] args)
	{
		ITestAnno ta = TestAnnoFactory.build();//ͨ�������������ӿ�ʵ��
		ta.sayHi();   //taֱ��ִ��sayHi����
	}	
}