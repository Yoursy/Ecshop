package com.tt.ecshop.pages;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tt.framework.utils.WrappedRemoteWebDriver;

/*
 * IndexPage类用于定义userpage.php页面的元素和方法
 * @author Yoursy
 */
public class UserPage
{
	public WrappedRemoteWebDriver wd ;
	private WebDriver driver;
	/*
	 * 登录名的输入框
	 */
	@FindBy(name="username")
	private WebElement username_input;
	/*
	 * 密码的输入框
	 */
	@FindBy(name="password")
	private WebElement password_input;
	
	
	/*
	 * 点击登录按钮
	 */
	@FindBy(name="submit")
	private WebElement submit_btn;
	
	/*
	 * 登录结果的文字
	 */
	@FindBy(css="div.boxCenterList > div >p")
	private WebElement login_result_text;
	
	
	/**
	 * 
	 * 使用页面工厂构造自己
	 */
	public UserPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}	
	/**
	 * 操作步骤：输入用户名
	 * @param username
	 */
	
	public void input_username(String username)
	{
		username_input.sendKeys(username);		
	}
	/**
	 * 操作步骤：输入密码
	 * @param password
	 */
	public void input_password(String password)
	{		
		password_input.sendKeys(password);
	}
	
	/**
	 * 点击立刻提交按钮
	 */
	public void click_submit()
	{
		submit_btn.click();
	}
	
	/**
	 * 断言的方法:判断登录成功时的检查点
	 */
	public void assert_login_result_text(String expectedText)
	{
		String actualText = login_result_text.getText();
		assertEquals(actualText,expectedText);
	}
	
	/**
	 * 用户名或密码为空时警告弹窗处理
	 * @param expectedtext
	 */
	public void assert_alert_text(String expectedtext)
	{
		Alert alert = driver.switchTo().alert();
		String actualText = alert.getText();
		alert.accept();		
		assertTrue(actualText.contains(expectedtext));
	}
}
