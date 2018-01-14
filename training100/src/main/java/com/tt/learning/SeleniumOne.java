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
		//1:����ϵͳ���ԣ���geckodriver���õ�ϵͳ������
		//������run-configration������ϵͳ����:-Dwebdriver.gecko.driver="·����"
		System.setProperty("webdriver.gecko.driver", "D:\\installer\\geckodriver-v0.19.1-win32\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();//newһ��FireFoxDriver
		driver.get("http://bbs.51testing.com");//ͨ��driver��ȡ�����Ӳ�������		
		
		
		Thread.sleep(2000);//��������
		
		List<WebElement> elements = driver.findElements(By.tagName("a"));
		System.out.println("Ԫ�ظ�����"+elements.size());
		
//		WebElement element = driver.findElement(By.className("a-all"));
//		ScrollToElement(driver,element);
//		element.click();
		
//		//2:���ҵ��ٶ������򣬲������������ݣ�enter->���뵽�������ҳ
//		WebElement element = driver.findElement(By.id("kw"));
//		element.sendKeys("51testing");
//		element.click();
//		Thread.sleep(2000);
//		
//		//3:��������������λ�ã�������������ʧ
//		WebElement element2 = driver.findElement(By.id("wrapper"));
//		element2.click();						
//		Thread.sleep(5000);
//		
//		WebElement element3 = driver.findElement(By.className("zdkjjt0-h2-v2"));
//		element3.click();
		
		//4:��ȡ����ҳ����������������list�У�Ȼ��һ�������ӵ��
		//4.1�������߼��㣺
		//	���ÿһ�����ӽ��뵽��ҳ���
//			��Ҫ���ҵ����ذ�ť
//			������ذ�ť����>�ص��ٶ��������ҳ
//			�ظ����ϲ���
		
		//List<WebElement> element_list =driver.findElements(By.className("result c-container"));
		//http://www.baidu.com/
//		List<WebElement> element_list =driver.findElements(By.tagName("a"));
//		System.out.println("��ȡ����Ԫ�ظ�����"+element_list.size());
//		
//		Iterator<WebElement> it = element_list.iterator();
//		
//		while(it.hasNext())
//		{			
//			it.next().click();			
//			Thread.sleep(2000);				
//			//���ص�ԭ���Ĵ���
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
//			//���з�����
//			service.start();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//						
//		WebDriver driver = new RemoteWebDriver(service.getUrl(),DesiredCapabilities.firefox());
//		
//		//��ȡurl
//		driver.get("https://www.baidu.com");
//		driver.close(); //�ر�����
//		
//		//��Ҫ����һ������ʱ����Ҫ����newһ��Զ������
//		driver = new RemoteWebDriver(service.getUrl(),DesiredCapabilities.firefox());
//		driver.get("http://bbs.51testing.com");
//		
//		//�ر�����
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
