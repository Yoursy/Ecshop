package com.tt.learning;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumOne
{
	public static void main(String[] args) throws InterruptedException
	{
		//1:设置系统属性，将geckodriver配置到系统属性中
		//可以在run-configration中设置系统属性:-Dwebdriver.gecko.driver="路径名"
		System.setProperty("webdriver.gecko.driver", "D:\\installer\\geckodriver-v0.19.1-win32\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();//new一个FireFoxDriver
		driver.get("http://bbs.51testing.com");//通过driver获取到链接并打开链接		
		
		
		Thread.sleep(2000);//设置休眠
		
		List<WebElement> elements = driver.findElements(By.tagName("a"));
		System.out.println("元素个数："+elements.size());
		
//		WebElement element = driver.findElement(By.className("a-all"));
//		ScrollToElement(driver,element);
//		element.click();
		
//		//2:查找到百度搜索框，并输入搜索内容，enter->进入到搜索结果页
//		WebElement element = driver.findElement(By.id("kw"));
//		element.sendKeys("51testing");
//		element.click();
//		Thread.sleep(2000);
//		
//		//3:将鼠标点击在上面的位置，让搜索词条消失
//		WebElement element2 = driver.findElement(By.id("wrapper"));
//		element2.click();						
//		Thread.sleep(5000);
//		
//		WebElement element3 = driver.findElement(By.className("zdkjjt0-h2-v2"));
//		element3.click();
		
		//4:获取整个页面的搜索结果，存入list中，然后一个个链接点击
		//4.1包含的逻辑点：
		//	点击每一个链接进入到新页面后
//			需要查找到返回按钮
//			点击返回按钮——>回到百度搜索结果页
//			重复以上操作
		
		//List<WebElement> element_list =driver.findElements(By.className("result c-container"));
		//http://www.baidu.com/
//		List<WebElement> element_list =driver.findElements(By.tagName("a"));
//		System.out.println("获取到的元素个数是"+element_list.size());
//		
//		Iterator<WebElement> it = element_list.iterator();
//		
//		while(it.hasNext())
//		{			
//			it.next().click();			
//			Thread.sleep(2000);				
//			//返回到原来的窗口
//			driver.navigate().back();				
//			Thread.sleep(2000);
//		}				
//		driver.close();
		
		
//		GeckoDriverService service = new GeckoDriverService.Builder()
//				.usingFirefoxBinary(new FirefoxBinary(new File("D:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe")))
//				.usingAnyFreePort().usingDriverExecutable(new File("D:\\installer\\geckodriver-v0.19.1-win32\\geckodriver.exe"))
//				.build();
//	
//		try {
//			//运行服务器
//			service.start();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//						
//		WebDriver driver = new RemoteWebDriver(service.getUrl(),DesiredCapabilities.firefox());
//		
//		//获取url
//		driver.get("https://www.baidu.com");
//		driver.close(); //关闭驱动
//		
//		//当要打开另一个链接时，需要重新new一个远程驱动
//		driver = new RemoteWebDriver(service.getUrl(),DesiredCapabilities.firefox());
//		driver.get("http://bbs.51testing.com");
//		
//		//关闭驱动
//		driver.close();
//		
//		service.stop();
	}

	private static void ScrollToElement(WebDriver driver, WebElement element)
	{
		// TODO Auto-generated method stub
		Point point = element.getLocation();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollTo(arguments[0],arg[1]", point.x,point.y);
	}
}
