package com.ttPageObject.learning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TetstingLTPageIndex
{
	public TetstingLTPageIndex(WebDriver driver)
	{
		
			PageFactory.initElements(driver, this);
		
	}

		//����λ����
		@FindBy(linkText="[�������������·]")//@FindBy��how="by.how"),ע�������Ԫ�ص����棬����ʹ������������������Ԫ��
		public WebElement form_1_link;
}
