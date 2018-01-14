package com.tt.learning;

public interface ITestAnno //定义一个接口，在创建proxy实例时传入接口
{
	@RunTime(count = 2)  //定义RunTime Annotation注释，执行次数为2次
	void sayHi();    //在接口中定的一个一个方法
}
