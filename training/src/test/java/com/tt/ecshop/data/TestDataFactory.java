package com.tt.ecshop.data;

import org.testng.annotations.DataProvider;

import com.tt.learning.ReadExcel;
/**
 * ������������������
 */
public class TestDataFactory
{
	@DataProvider(name="loginTestData")//dataprovider������
	public static Object[][] getLoginTestData()
	{		
		return ReadExcel.getLoginDataFromExcel("loginTestData.xlsx", "Sheet1");		
	}
	
	@DataProvider(name="RegiestTestData")
	public static Object[][] getRegiestTestData()
	{
		return ReadExcel.getRegiestDataFromExcel("RegiestTestData.xlsx","Sheet1");
	}
}
