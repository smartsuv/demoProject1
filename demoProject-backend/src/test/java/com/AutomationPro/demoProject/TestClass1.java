package com.AutomationPro.demoProject;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestClass1 {
	public static WebDriver driver;
	@BeforeMethod
	public void launchDriver()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\source\\repos\\SuvTesting\\SuvTesting\\bin\\Debug\\net6.0\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().fullscreen();
	}
	@Test
	public void Test1()
	{
		driver.navigate().to("www.AutomationTalks.com");
		System.out.println("Test1 Title is "+driver.getTitle());
	}
	@Test
	public void Test2()
	{
		driver.navigate().to("www.AutomationTalks.com");
		System.out.println("Test2 Title is "+driver.getTitle());
	}
	@Test
	public void Test3()
	{
		driver.navigate().to("www.AutomationTalks.com");
		System.out.println("Test3 Title is "+driver.getTitle());
	}
	@AfterMethod
	public void quit()
	{
		driver.quit();
	}
}


