package com.tt.ecshop.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


/*
 * IndexPage类用于定义Index.php页面的元素和方法
 * @author Yoursy
 */
public class IndexPage
{
	/*
	 * 登录
	 */
	@FindBy(linkText="请登录")
	private WebElement login_link;
	
	@FindBy(linkText="免费注册")
	private WebElement register_link;
	
	/*
	 * 使用页面工程构造自己
	 * @param driver
	 */
	public IndexPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}	
	/*
	 * 操作步骤：点击登录链接
	 */
	public void click_login_click()
	{
		login_link.click();
	}
	
	public void click_register_lick()
	{
		register_link.click();
	}
}
