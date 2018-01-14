package com.tt.framework.utils;

import java.io.File;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class WrappedRemoteWebDriver extends RemoteWebDriver
{
	public WrappedRemoteWebDriver(URL remoteAddress, Capabilities capabilities)
	{
		super(remoteAddress,capabilities);
	}
	
	@Override
	protected WebElement findElement(String by, String using) 
	{
	    WebElement element = super.findElement(by,using);
		return element; 
	}
	
	@Override
	protected List<WebElement> findElements(String by, String using)
	{
		List<WebElement> elements = null;
		elements = super.findElements(by,using); //通过继承父类的findelements来		
		return elements;		
	}
	
	/**
	 * 将截屏报错到一个文件中
	 * @param filename
	 */
	public void TakeScreenshot(String filename)
	{
		File ScreenShot = ((TakesScreenshot)this).getScreenshotAs(OutputType.FILE);
		File directroy = new File("ScreenShot");
		if(!directroy.exists() || !directroy.isDirectory())
		{
			directroy.mkdir();
		}
		ScreenShot.renameTo(new File(directroy,filename));
		
	}
}
