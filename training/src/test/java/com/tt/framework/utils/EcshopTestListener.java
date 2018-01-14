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
			//拿到测试类里的driver->拿到真实的测试类，测试类为xml里指定的测试类
			/**
			 * 方法一,采用封装的方法，将截屏方法封装到一起
			 */
			field = tr.getTestClass().getRealClass().getField("driver");
//			WrappedRemoteWebDriver driver = (WrappedRemoteWebDriver)field.get(tr.getInstance());
//			
//			/**
//			 * 传入一个文件名，文件名的格式：类名+方法名+时间
//			 */
//			String classname = tr.getTestClass().getName();
//			String methodName = tr.getName();
//			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-H_m_s_S");
//			String time =  sdf.format(new Date());//获取当前的时间，直接new 一个Date
//			driver.TakeScreenshot(classname +"-"+methodName+"-"+time+"-"+".png");
			
			/**
			 * 
			 */
			WebDriver driver = (WebDriver)field.get(tr.getInstance()); //强制类型转换成webdriver时，得到的是webdriver对象
			//WrappedRemoteWebDriver继承自实现了WebDriver接口的RemoteWebDriver，因此可以强制类型转换成WrappedRemoteWebDriver，这样就
			//可以不用定义一个WrappedRemoteWebDriver对象了					
			File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			file.renameTo(new File("faild3.png"));
			
		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e)
		{
			e.printStackTrace();
		}
	}
}
