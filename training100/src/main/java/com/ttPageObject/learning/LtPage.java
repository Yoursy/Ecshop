package com.ttPageObject.learning;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LtPage   //创建一个论坛页面类
{
	@FindBy(linkText="软件新手上路")   //使用注解的方式去查找这个元素	
	public WebElement webelement;  //在该页面中有元素webelement	
}
