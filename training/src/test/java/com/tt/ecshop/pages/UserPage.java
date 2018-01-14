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
 * IndexPage�����ڶ���userpage.phpҳ���Ԫ�غͷ���
 * @author Yoursy
 */
public class UserPage
{
	public WrappedRemoteWebDriver wd ;
	private WebDriver driver;
	/*
	 * ��¼���������
	 */
	@FindBy(name="username")
	private WebElement username_input;
	/*
	 * ����������
	 */
	@FindBy(name="password")
	private WebElement password_input;
	
	
	/*
	 * �����¼��ť
	 */
	@FindBy(name="submit")
	private WebElement submit_btn;
	
	/*
	 * ��¼���������
	 */
	@FindBy(css="div.boxCenterList > div >p")
	private WebElement login_result_text;
	
	
	/**
	 * 
	 * ʹ��ҳ�湤�������Լ�
	 */
	public UserPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}	
	/**
	 * �������裺�����û���
	 * @param username
	 */
	
	public void input_username(String username)
	{
		username_input.sendKeys(username);		
	}
	/**
	 * �������裺��������
	 * @param password
	 */
	public void input_password(String password)
	{		
		password_input.sendKeys(password);
	}
	
	/**
	 * ��������ύ��ť
	 */
	public void click_submit()
	{
		submit_btn.click();
	}
	
	/**
	 * ���Եķ���:�жϵ�¼�ɹ�ʱ�ļ���
	 */
	public void assert_login_result_text(String expectedText)
	{
		String actualText = login_result_text.getText();
		assertEquals(actualText,expectedText);
	}
	
	/**
	 * �û���������Ϊ��ʱ���浯������
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
