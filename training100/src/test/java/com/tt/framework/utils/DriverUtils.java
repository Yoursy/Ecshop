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
 *DriverUtils�������ṩservice�ĵ�����������ƥ�䲻ͬ�������driver����
 */
public class DriverUtils
{
	/**
	 * service�������ڱ�������û����õ�ϵͳ�����������Ĳ�ͬ�������driverservice
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
			throw new RuntimeException("Ϊ֧�ֵ���������ͣ�����ϵͳ����");
		}
		try {
			service.start(); // ����service
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static WebDriver getDriver()
	{
		WebDriver driver = null;
		DesiredCapabilities caps = null;
		/*
		 * ����browser��ֵ�ж�������browser����
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
			throw new RuntimeException("δ֧�ֵ���������ͣ�����ϵͳ����bwf.test.browser");
		}
		driver = new RemoteWebDriver(service.getUrl(), caps);
		return driver;
	}
	/**
	 * ֹͣ����
	 */
	public static void stopService() {
		service.stop();
	}
}
