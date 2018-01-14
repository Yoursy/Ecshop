package com.tt.ecshop.tests;
import org.testng.annotations.Test;

import com.tt.ecshop.data.TestDataFactory;
import com.tt.ecshop.pages.IndexPage;
import com.tt.ecshop.pages.UserPage;
import com.tt.framework.utils.BaseTest;

public class LoginTest extends BaseTest
{	/**
	*使用dataprovider参数化，dataprovider类里二维数组的元素有多少个，在以下的函数形参就需要设置多少个，要不然会造成传参失败
	*/
	@Test(dataProvider="loginTestData",dataProviderClass=TestDataFactory.class)
	public void testLogin(String username,String password,String expected)
	{
		/**
		 * 步骤：
		 * 1：打开首页
		 * 2：点击登录链接
		 * 3：填写用户名、密码
		 * 4：点击立刻登录按钮
		 * 5：判断是否登录成功
		 */
		//打开首页
		driver.get("http://localhost/ecshop");
	
		//点击登录按钮
		IndexPage indexpage=new IndexPage(driver);
		indexpage.click_login_click();
		
		//进入到登录页面
		UserPage userpage=new UserPage(driver);		
		//填写用户名密码
		userpage.input_username(username);
		userpage.input_password(password);		
		//点击立即登录按钮
		userpage.click_submit();
		
		//判断是否登录成功
		//System.out.println(driver.getPageSource());//面对找不到的元素，可以先打印出来，再定位查找
		
		//当用户名、密码为空时做判断
		
		if(username==""||password=="")
		{
			userpage.assert_alert_text(expected);
		}
		else 
		{
			userpage.assert_login_result_text(expected);
		}		
	}
}
