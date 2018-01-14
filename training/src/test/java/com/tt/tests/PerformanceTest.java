package com.tt.tests;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.Test;

public class PerformanceTest
{
	@Test(invocationCount=50,threadPoolSize=50)
	public void push51Testing() throws Exception
	{
		long start = System.currentTimeMillis();
		URL url = new URL("http://bbs.51testing.com");
		HttpURLConnection http =(HttpURLConnection) url.openConnection();
		http.setDoInput(true);
		int code = http.getResponseCode();
		InputStream is = http.getInputStream();
		long end = System.currentTimeMillis();
		
		System.out.println("code:"+code+",time:"+(end-start));
	}
}
