package com.tt.ecshop.tests;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import com.tt.ecshop.data.TestDataFactory;
import com.tt.ecshop.pages.IndexPage;
import com.tt.ecshop.pages.RegiestPage;
import com.tt.ecshop.pages.UserPage;
import com.tt.framework.utils.BaseTest;

/**
 * 该类实现用户注册功能
 * @author YOURSY
 *
 */
public class RegiesTest extends BaseTest
{
	//public static final Logger log = LogManager.getLogger(RegiesTest.class);
	
	@Test(dataProvider="RegiestTestData",dataProviderClass=TestDataFactory.class)
	public void Regiestsucces(String username_reg,  String password_reg, 
			String comfirm_password_reg,String email_reg,  String cellPhone_reg, String expectedText) throws Exception
	{
		
		/**测试步骤：
		 * 1:打开首页
		 * 2:点击“免费注册”按钮进入注册页面
		 * 3:填写注册信息
		 * 4:点击提交按钮
		 * 5:结果判断
		 */
		//打开首页sss
		
		
		driver.get("http://localhost/ecshop");		
		IndexPage indexpage=new IndexPage(driver);
		
		
		indexpage.click_register_lick();		
		try
		{
			Thread.sleep(2000);
		} catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		RegiestPage regiest = new RegiestPage(driver);
		
		//填写注册信息	
	
		regiest.input_username(username_reg);
		
		
		regiest.input_password(password_reg);
		
		
		regiest.input_comfirm_password(comfirm_password_reg);
	
		
		regiest.input_email(email_reg);
		
		
		regiest.input_cellphone(cellPhone_reg);
		
		
		regiest.click_checkBox();
		
		//点击注册按钮
		
		regiest.click_Regiest_Button();
		try
		{
			Thread.sleep(10000);
		} catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		//判断是否注册成功
		System.out.println(driver.getPageSource());//讲跳转到的页面的html代码打印出来，然后查找相关的元素
		//regiest.assert_Regiest_result_text(expectedText);
		
	}
}
