package com.tt.framework.utils;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.service.DriverService;

/**
 * 
 * @author YOURSY
 *DriverUtils类用于提供service的单例启动，并匹配不同浏览器的driver对象
 */
public class DriverUtils
{
	/**
	 * service对象，用于保存根据用户设置的系统属性来创建的不同浏览器的driverservice
	 * 
	 */
	private static DriverService service;
	private static String browser;
	
	static {
		Config config = new Config("config.properties");
		browser = System.getProperty("bwf.test.browser",config.getConfig("bwf.test.browser"));
		if("firefox".equalsIgnoreCase(browser))
		{
			service=new GeckoDriverService.Builder()
					.usingFirefoxBinary(new FirefoxBinary(new File(config.getConfig("executable"))))
					.usingAnyFreePort()
					.usingDriverExecutable(new File(config.getConfig("driver")))
					.build();
		}
		else if("chrom".equalsIgnoreCase(browser))
		{
			service=null;
		}
		else 
		{
			throw new RuntimeException("为支持的浏览器类型，请检查系统属性");
		}
		try {
			service.start(); // 启动service
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static WebDriver getDriver()
	{
		WebDriver driver = null;
		DesiredCapabilities caps = null;
		/*
		 * 根据browser的值判断启动的browser类型
		 */
		if("firefox".equalsIgnoreCase(browser)) {
			caps = DesiredCapabilities.firefox();
		}else if("chrome".equalsIgnoreCase(browser)) {
			// not yet implemenent
			caps = null;
		}else if("ie".equalsIgnoreCase(browser)){
			// not yet implemenent
			caps = null;
		}else {
			throw new RuntimeException("未支持的浏览器类型，请检查系统属性bwf.test.browser");
		}
		driver = new RemoteWebDriver(service.getUrl(), caps);
		return driver;
	}
	/**
	 * 停止服务
	 */
	public static void stopService() {
		service.stop();
	}
}
