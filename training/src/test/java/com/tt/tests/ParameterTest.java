package com.tt.tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest
{
	@Parameters({"username","password"})
	@Test
	public void testp(String u, String p)
	{
		System.out.println("username:"+u+"password:"+p);
	}
}
