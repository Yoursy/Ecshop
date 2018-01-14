package com.tt.learning;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;


//����ʵ�ִ���headler�Ĺ��ܣ��̳���InvocationHandler�ӿڣ���Ҫʵ�ָýӿڵ�invocke����
public class TestAnnoInvocationHeandler implements InvocationHandler
{

	@Override
	public Object invoke(Object proxy, Method method, Object[] arg2) throws Throwable
	{
		
		//�ڸ÷����У�ͨ����ȥӳ���ҵ�annotation��
		TestAnno ta = new TestAnno();
		RunTime rt = method.getAnnotation(RunTime.class);
		int count = rt.count();//��ȡcount����		
		Object obj = rt.count();
		for(int i = 0; i < count ; i++)
		{
			//ִ��method
			System.out.println("-->��ʼ����ִ��"+(i+1)+"��");
			obj = method.invoke(ta,arg2);
		}
		return obj;
	}
}
