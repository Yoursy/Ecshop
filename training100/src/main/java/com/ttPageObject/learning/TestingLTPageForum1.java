package com.ttPageObject.learning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TestingLTPageForum1  //定义一个【软件测试新手上路论坛版块的页面工厂】
{
	
	///html/body/div[8]/div[5]/div[2]/div[4]/div[2]/div[2]/table/tbody
	///tr[1]/td[2]/h2/a
	///html/body/div[8]/div[5]/div/div[2]/div[5]/div[2]/form/table
	//tbody[1]/tr/th/strong/a
	//tbody[2]/tr/th/a[3]
	
//	/html/body/div[8]/div[5]/div/div[2]/div[5]/div[2]/form/table/tbody[1]/tr/th/strong/a
//	/html/body/div[8]/div[5]/div/div[2]/div[5]/div[2]/form/table/tbody[2]/tr/th/a[4]
//	/html/body/div[8]/div[5]/div/div[2]/div[5]/div[2]/form/table/tbody[3]/tr/th/a[4]
//	/html/body/div[8]/div[5]/div/div[2]/div[5]/div[2]/form/table/tbody[4]/tr/th/a[4]
	///html/body/div[8]/div[5]/div/div[2]/div[5]/div[2]/form/table/tbody[1]
	
	//xpath="//table[@id='thradlisttableid']/tbody[contains(@id,'normalthread_']"
	
	@FindBy(xpath="/html/body/div[8]/div[5]/div/div[2]/div[5]/div[2]/form/table/*")
	public List<WebElement> threads;
	
	
	public void elementClick(int index)
	{
		threads.get(index).findElement(By.xpath("tr/th/a[4]")).click();
	}
}
