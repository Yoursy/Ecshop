package com.tt.ecshop.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


/*
 * IndexPage�����ڶ���Index.phpҳ���Ԫ�غͷ���
 * @author Yoursy
 */
public class IndexPage
{
	/*
	 * ��¼
	 */
	@FindBy(linkText="���¼")
	private WebElement login_link;
	
	@FindBy(linkText="���ע��")
	private WebElement register_link;
	
	/*
	 * ʹ��ҳ�湤�̹����Լ�
	 * @param driver
	 */
	public IndexPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}	
	/*
	 * �������裺�����¼����
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
