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
 * ����ʵ���û�ע�Ṧ��
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
		
		/**���Բ��裺
		 * 1:����ҳ
		 * 2:��������ע�ᡱ��ť����ע��ҳ��
		 * 3:��дע����Ϣ
		 * 4:����ύ��ť
		 * 5:����ж�
		 */
		//����ҳsss
		
		
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
		
		//��дע����Ϣ	
	
		regiest.input_username(username_reg);
		
		
		regiest.input_password(password_reg);
		
		
		regiest.input_comfirm_password(comfirm_password_reg);
	
		
		regiest.input_email(email_reg);
		
		
		regiest.input_cellphone(cellPhone_reg);
		
		
		regiest.click_checkBox();
		
		//���ע�ᰴť
		
		regiest.click_Regiest_Button();
		try
		{
			Thread.sleep(10000);
		} catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		//�ж��Ƿ�ע��ɹ�
		System.out.println(driver.getPageSource());//����ת����ҳ���html�����ӡ������Ȼ�������ص�Ԫ��
		//regiest.assert_Regiest_result_text(expectedText);
		
	}
}
