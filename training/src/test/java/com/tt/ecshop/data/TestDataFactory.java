package com.tt.ecshop.data;

import org.testng.annotations.DataProvider;

import com.tt.learning.ReadExcel;
/**
 * 该类用来参数化传递
 */
public class TestDataFactory
{
	@DataProvider(name="loginTestData")//dataprovider的名称
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
