package com.AutomationPro.demoProject;

import java.util.concurrent.TimeUnit;

//import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;

public class TestClass1 {
	public static WebDriver driver;
	public static final String username ="suvarnabharati_08yCRc";
	public static final String Automate_Key="WqdnFBaxBbhdabhAvhPb";
	public static final String URL="https://" + username + ":" + Automate_Key + "@hub_cloud.browserstack.com/wd/hub";
	@BeforeMethod
	public void launchDriver() throws MalformedURLException
	{
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("browser","chrome");
		cap.setCapability("browser_version","100.0");
		cap.setCapability("os","Windows");
		cap.setCapability("os_version","10");
		cap.setCapability("resolution","1024x768");
		
		cap.setCapability("projectName", "demoProject-backend");
		cap.setCapability("buildName", "build");
		cap.setCapability("sessionName", "TestCaseName");
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\source\\repos\\SuvTesting\\SuvTesting\\bin\\Debug\\net6.0\\chromedriver.exe");
		driver=new RemoteWebDriver(new URL(URL),cap);
		
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


