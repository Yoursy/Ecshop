package com.tt.framework.utils;
import java.io.File;
import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class EcshopTestListener extends TestListenerAdapter
{	
	
	@Override
	public void onTestFailure(ITestResult tr)
	{
		super.onTestFailure(tr);		
		Field field;
		try
		{
			//�õ����������driver->�õ���ʵ�Ĳ����࣬������Ϊxml��ָ���Ĳ�����
			/**
			 * ����һ,���÷�װ�ķ�����������������װ��һ��
			 */
			field = tr.getTestClass().getRealClass().getField("driver");
//			WrappedRemoteWebDriver driver = (WrappedRemoteWebDriver)field.get(tr.getInstance());
//			
//			/**
//			 * ����һ���ļ������ļ����ĸ�ʽ������+������+ʱ��
//			 */
//			String classname = tr.getTestClass().getName();
//			String methodName = tr.getName();
//			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-H_m_s_S");
//			String time =  sdf.format(new Date());//��ȡ��ǰ��ʱ�䣬ֱ��new һ��Date
//			driver.TakeScreenshot(classname +"-"+methodName+"-"+time+"-"+".png");
			
			/**
			 * 
			 */
			WebDriver driver = (WebDriver)field.get(tr.getInstance()); //ǿ������ת����webdriverʱ���õ�����webdriver����
			//WrappedRemoteWebDriver�̳���ʵ����WebDriver�ӿڵ�RemoteWebDriver����˿���ǿ������ת����WrappedRemoteWebDriver��������
			//���Բ��ö���һ��WrappedRemoteWebDriver������					
			File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			file.renameTo(new File("faild3.png"));
			
		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e)
		{
			e.printStackTrace();
		}
	}
}
