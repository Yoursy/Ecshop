package com.tt.learning;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;


//该类实现创建headler的功能，继承了InvocationHandler接口，需要实现该接口的invocke方法
public class TestAnnoInvocationHeandler implements InvocationHandler
{

	@Override
	public Object invoke(Object proxy, Method method, Object[] arg2) throws Throwable
	{
		
		//在该方法中，通过类去映射找到annotation，
		TestAnno ta = new TestAnno();
		RunTime rt = method.getAnnotation(RunTime.class);
		int count = rt.count();//获取count属性		
		Object obj = rt.count();
		for(int i = 0; i < count ; i++)
		{
			//执行method
			System.out.println("-->开始代理执行"+(i+1)+"次");
			obj = method.invoke(ta,arg2);
		}
		return obj;
	}
}
