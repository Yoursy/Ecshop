package com.tt.learning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class PODome
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver", "D:\\installer\\geckodriver-v0.19.1-win32\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();//newһ��FireFoxDriver
		driver.get("http://bbs.51testing.com");//ͨ��driver��ȡ�����Ӳ�������		
		//��ҳ�濴��һ��������,ʹ��TestingLTPageIndex������һ��ҳ�湤��
		TestingLTPageIndex indexpage = PageFactory.initElements(driver,TestingLTPageIndex.class); //ʹ��ҳ�湤��
		indexpage.form_1_link.click();
		driver.close();
	}	
}
