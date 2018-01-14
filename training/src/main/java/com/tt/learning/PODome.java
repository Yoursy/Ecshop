package com.tt.learning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class PODome
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver", "D:\\installer\\geckodriver-v0.19.1-win32\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();//new一个FireFoxDriver
		driver.get("http://bbs.51testing.com");//通过driver获取到链接并打开链接		
		//将页面看成一个对象来,使用TestingLTPageIndex来创建一个页面工厂
		TestingLTPageIndex indexpage = PageFactory.initElements(driver,TestingLTPageIndex.class); //使用页面工厂
		indexpage.form_1_link.click();
		driver.close();
	}	
}
