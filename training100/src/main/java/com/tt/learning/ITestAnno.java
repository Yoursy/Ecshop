package com.tt.learning;

public interface ITestAnno //����һ���ӿڣ��ڴ���proxyʵ��ʱ����ӿ�
{
	@RunTime(count = 2)  //����RunTime Annotationע�ͣ�ִ�д���Ϊ2��
	void sayHi();    //�ڽӿ��ж���һ��һ������
}
