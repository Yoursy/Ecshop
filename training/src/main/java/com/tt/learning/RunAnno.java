package com.tt.learning;

import java.lang.reflect.Method;

public class RunAnno
{
	//ʹ��java�ķ�����ƣ�ͨ��������ȡ���෽����ͨ���෽����ȡ��������

	public static void main(String[] args) throws Exception, SecurityException
	{
		
		TestAnno ta = new TestAnno();
		Method method = TestAnno.class.getDeclaredMethod("sayHi");
		RunTime rt = method.getAnnotation(RunTime.class);//ͨ��method����ȥ��ȡע����
		int count = rt.count();//��ȡcount����		
		for(int i = 0; i < count ; i++)
		{
			//ִ��method
			method.invoke(ta);
		}
		
	}
}
