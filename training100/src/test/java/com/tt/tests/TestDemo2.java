package com.tt.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestDemo2
{
	@BeforeTest
	public void beforeTestM()
	{
		System.out.println("--beforeTestM");
	}
	@AfterTest
	public void AfterTestM()
	{
		System.out.println("--AfterTestM");
	}
	
	@BeforeClass
	public void beforeClassM()
	{
		System.out.println("--beforeClassM");
	}
	@AfterClass
	public void afterClassM()
	{
		System.out.println("--afterClassM");
	}
	@Test(groups= {"firstLevel"})
	public void myTestfunc21()
	{
		System.out.println("---testmethod -mytestfunc21");
	}
	@Test(groups= {"seconLevel"})
	public void muTestfunc22()
	{
		System.out.println("---testmethod -mytestfunc22");
	}
	@Test
	public void miTestfunc23()
	{
		System.out.println("---testmethod -mytestfunc23");
	}
	
}
