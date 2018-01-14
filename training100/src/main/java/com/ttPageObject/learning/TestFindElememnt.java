package com.ttPageObject.learning;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestFindElememnt implements ITestFindElement
{
	@Override
	public void findElement_and_click()
	{	
		System.setProperty("webdriver.gecko.driver", "D:\\installer\\geckodriver-v0.19.1-win32\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();//new一个FireFoxDriver		
		driver.get("http://bbs.51testing.com");//通过driver获取到链接并打开链接		
		//WebElement webelement=driver.findElement(By.linkText("[软件测试新手上路 ]"));		
		//WebElement webelement=driver.findElement(By.xpath("/html/body/div[8]/div[5]/div[2]/div[4]/div[2]/div[2]/table/tbody/tr[1]/td[2]/h2/a"));		
		List<WebElement> elements = driver.findElements(By.tagName("a"));		
		Iterator<WebElement> it = elements.iterator();
		while(it.hasNext())
		{
			it.next().click();
			try
			{
				Thread.sleep(1000);
			} catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.navigate().back();
		}						
	}	
}
