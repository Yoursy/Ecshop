package com.tt.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestDemo1
{
	@BeforeSuite
	public void beforeSuiteM()
	{
		System.out.println("--BeforeSuite11");
	}
	@AfterSuite
	public void AfterSuiteM()
	{
		System.out.println("--AfterSuiteM11");
	}
	@BeforeTest
	public void beforeTestM()
	{
		System.out.println("-------beforeTestM11");
	}
	@AfterTest
	public void AfterTestM()
	{
		System.out.println("-------AfterTestM11");
	}
	
	@BeforeClass
	public void beforeClassM()
	{
		System.out.println("-----beforeClassM11");
	}
	@AfterClass
	public void afterClassM()
	{
		System.out.println("-----afterClassM11");
	}
	
	
	
	@Test(groups= {"firstLevel"})
	public void myTestfunc()
	{
		System.out.println("*************testmethod -mytestfunc11");
	}
	@Test(dependsOnMethods= {"myTestfunc"})//设置依赖
	public void muTestfunc()
	{
		System.out.println("*************testmethod -mytestfunc12");
	}
	@Test(groups= {"seconLevel"},dependsOnGroups= {"firstLevel"})//被依赖的测试会被先执行
	public void miTestfunc()
	{
		System.out.println("*************testmethod -mytestfunc13");
	}
	
}
