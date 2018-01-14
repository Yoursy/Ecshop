package com.tt.ecshop.pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegiestPage
{
	public WebDriver driver;
	public String first_password;
	public String comfirm_password;
	
	public RegiestPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	/**
	 * 注册的用户名
	 */
	@FindBy(id="username")
	private WebElement username_reg;
	
	/**
	 * 注册的邮箱
	 */
	@FindBy(id="email")
	private WebElement email_reg;
	
	/**
	 * 注册的密码
	 */
	@FindBy(id="password1")
	private WebElement password_reg;
	
	/**
	 * 密码强度弱
	 */
	@FindBy(id="pwd_lower")
	private WebElement password_low_reg;
	
	/**
	 * 密码强度中
	 */
	@FindBy(id="pwd_middle")
	private WebElement password_middle_reg;
	
	/**
	 * 密码强度强
	 */
	@FindBy(id="pwd_high")
	private WebElement password_high_reg;
	
	/**
	 * 确认密码
	 */
	@FindBy(id="conform_password")
	private WebElement password_comfirm_reg;
	
	/**
	 * 手机号
	 */
	@FindBy(name="extend_field5")
	private WebElement cellPhone_reg;
	
	/**
	 * 我已看过并接受检查框
	 */
	@FindBy(name="agreement")
	private WebElement checkBox_reg;
	
	/**
	 * 立即注册按钮
	 */
	@FindBy(name="Submit")
	private WebElement regiest_button;
	
	/**
	 * 注册成功后，检查点元素
	 */
	@FindBy(css="div.boxCenterList > div >p")
	private WebElement regiest_result_text;
	
	
	/**
	 * 输入用户名方法
	 * @param username
	 */
	public void input_username(String username)
	{
		username_reg.sendKeys(username);
	}
	
	/**
	 * 输入密码方法
	 * @param password
	 */
	public void input_password(String password)
	{
		password_reg.sendKeys(password);
		first_password = password;
	}
	
	/**
	 * 输入确认密码
	 * @param comfirm_password
	 */
	public void input_comfirm_password(String comfirm_password)
	{
		password_comfirm_reg.sendKeys(comfirm_password);
		
		this.comfirm_password = comfirm_password;
	}
	
	/**
	 * 输入邮箱
	 * @param email
	 */
	public void input_email(String email)
	{
		email_reg.sendKeys(email);
	}
	
	/**
	 * 输入手机号
	 * @param cellphone
	 */
	public void input_cellphone(String cellphone)
	{
		cellPhone_reg.sendKeys(cellphone);
	}
	
	/**
	 * 点击复选框
	 */
	public void click_checkBox()
	{
		if(!checkBox_reg.isSelected())
		{
			checkBox_reg.sendKeys(Keys.SPACE);
		}		
	}
	
	/**
	 * 点击立即注册按钮提交数据进行注册
	 */
	public void click_Regiest_Button()
	{
		regiest_button.click();
	}
	
	/**
	 * 断言的方法:判断注册成功时的检查点
	 */
	public void assert_Regiest_result_text(String expectedText)
	{
		String actualText = regiest_result_text.getText();
		assertEquals(actualText,expectedText);
	}
	
	/**
	 * 判断两次输入的密码是否一致
	 */
	public void some_password()
	{
		if(!first_password.equals(password_comfirm_reg))
		{
			//查找右边的提示语：两次密码不一致
			
		}
	}
}
