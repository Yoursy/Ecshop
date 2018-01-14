package com.tt.learning;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class DoTestListener extends TestListenerAdapter 
{
	
	@Override
	public void onTestFailure(ITestResult result)
	{
		super.onTestFailure(result);
		System.out.println(".f");

	}
	
	@Override
	public void onTestSuccess(ITestResult tr)
	{
		// TODO Auto-generated method stub
		super.onTestSuccess(tr);
	}
}
