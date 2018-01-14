package com.tt.framework.utils;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

/**
 * ʵ�����ܹ���
 * @author YOURSY
 *
 */
public class RetryListener implements IInvokedMethodListener
{

	@Override
	public void beforeInvocation(IInvokedMethod method, ITestResult testResult)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterInvocation(IInvokedMethod method, ITestResult testResult)
	{
		//������ܷ�����	
		IRetryAnalyzer retry = method.getTestMethod().getRetryAnalyzer();
		if(retry == null)
		{
			method.getTestMethod().setRetryAnalyzer(new RetryAnalysiz());		
		}
	}

}
