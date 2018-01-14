package com.tt.learning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//测试网站为：http://www.51testing.com
//使用pageobject实现一个页面中查找多个元素
public class TestingLTPageIndex
{
	//将定位分离
	@FindBy(linkText="[软件测试新手上路]")//@FindBy（how="by.how"),注解在这个元素的上面，表明使用这个方法来查找这个元素
	public WebElement form_1_link;
	
	
		
}
