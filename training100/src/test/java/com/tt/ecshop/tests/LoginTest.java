package com.tt.ecshop.tests;
import org.testng.annotations.Test;

import com.tt.ecshop.data.TestDataFactory;
import com.tt.ecshop.pages.IndexPage;
import com.tt.ecshop.pages.UserPage;
import com.tt.framework.utils.BaseTest;

public class LoginTest extends BaseTest
{	/**
	*ʹ��dataprovider��������dataprovider�����ά�����Ԫ���ж��ٸ��������µĺ����βξ���Ҫ���ö��ٸ���Ҫ��Ȼ����ɴ���ʧ��
	*/
	@Test(dataProvider="loginTestData",dataProviderClass=TestDataFactory.class)
	public void testLogin(String username,String password,String expected)
	{
		/**
		 * ���裺
		 * 1������ҳ
		 * 2�������¼����
		 * 3����д�û���������
		 * 4��������̵�¼��ť
		 * 5���ж��Ƿ��¼�ɹ�
		 */
		//����ҳ
		driver.get("http://localhost/ecshop");
	
		//�����¼��ť
		IndexPage indexpage=new IndexPage(driver);
		indexpage.click_login_click();
		
		//���뵽��¼ҳ��
		UserPage userpage=new UserPage(driver);		
		//��д�û�������
		userpage.input_username(username);
		userpage.input_password(password);		
		//���������¼��ť
		userpage.click_submit();
		
		//�ж��Ƿ��¼�ɹ�
		//System.out.println(driver.getPageSource());//����Ҳ�����Ԫ�أ������ȴ�ӡ�������ٶ�λ����
		
		//���û���������Ϊ��ʱ���ж�
		
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
