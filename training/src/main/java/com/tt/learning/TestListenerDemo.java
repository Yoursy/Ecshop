package com.tt.learning;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class TestListenerDemo
{
	@Test
	public void testfun1()
	{
		assertEquals(1, 1);
	}
	@Test
	public void testfun2()
	{
		assertEquals(1, 2);
	}

}
