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
	 * ע����û���
	 */
	@FindBy(id="username")
	private WebElement username_reg;
	
	/**
	 * ע�������
	 */
	@FindBy(id="email")
	private WebElement email_reg;
	
	/**
	 * ע�������
	 */
	@FindBy(id="password1")
	private WebElement password_reg;
	
	/**
	 * ����ǿ����
	 */
	@FindBy(id="pwd_lower")
	private WebElement password_low_reg;
	
	/**
	 * ����ǿ����
	 */
	@FindBy(id="pwd_middle")
	private WebElement password_middle_reg;
	
	/**
	 * ����ǿ��ǿ
	 */
	@FindBy(id="pwd_high")
	private WebElement password_high_reg;
	
	/**
	 * ȷ������
	 */
	@FindBy(id="conform_password")
	private WebElement password_comfirm_reg;
	
	/**
	 * �ֻ���
	 */
	@FindBy(name="extend_field5")
	private WebElement cellPhone_reg;
	
	/**
	 * ���ѿ��������ܼ���
	 */
	@FindBy(name="agreement")
	private WebElement checkBox_reg;
	
	/**
	 * ����ע�ᰴť
	 */
	@FindBy(name="Submit")
	private WebElement regiest_button;
	
	/**
	 * ע��ɹ��󣬼���Ԫ��
	 */
	@FindBy(css="div.boxCenterList > div >p")
	private WebElement regiest_result_text;
	
	
	/**
	 * �����û�������
	 * @param username
	 */
	public void input_username(String username)
	{
		username_reg.sendKeys(username);
	}
	
	/**
	 * �������뷽��
	 * @param password
	 */
	public void input_password(String password)
	{
		password_reg.sendKeys(password);
		first_password = password;
	}
	
	/**
	 * ����ȷ������
	 * @param comfirm_password
	 */
	public void input_comfirm_password(String comfirm_password)
	{
		password_comfirm_reg.sendKeys(comfirm_password);
		
		this.comfirm_password = comfirm_password;
	}
	
	/**
	 * ��������
	 * @param email
	 */
	public void input_email(String email)
	{
		email_reg.sendKeys(email);
	}
	
	/**
	 * �����ֻ���
	 * @param cellphone
	 */
	public void input_cellphone(String cellphone)
	{
		cellPhone_reg.sendKeys(cellphone);
	}
	
	/**
	 * �����ѡ��
	 */
	public void click_checkBox()
	{
		if(!checkBox_reg.isSelected())
		{
			checkBox_reg.sendKeys(Keys.SPACE);
		}		
	}
	
	/**
	 * �������ע�ᰴť�ύ���ݽ���ע��
	 */
	public void click_Regiest_Button()
	{
		regiest_button.click();
	}
	
	/**
	 * ���Եķ���:�ж�ע��ɹ�ʱ�ļ���
	 */
	public void assert_Regiest_result_text(String expectedText)
	{
		String actualText = regiest_result_text.getText();
		assertEquals(actualText,expectedText);
	}
	
	/**
	 * �ж���������������Ƿ�һ��
	 */
	public void some_password()
	{
		if(!first_password.equals(password_comfirm_reg))
		{
			//�����ұߵ���ʾ��������벻һ��
			
		}
	}
}
