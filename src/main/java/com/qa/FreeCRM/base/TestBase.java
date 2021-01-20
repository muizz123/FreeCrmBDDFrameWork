package com.qa.FreeCRM.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.FreeCRM.util.TestUtil;



public class TestBase {

	public static WebDriver driver;
	public static Properties pro; 
	
	public TestBase() throws IOException  {
		
		 pro = new Properties();
		FileInputStream fis = new FileInputStream("src\\main\\java\\com\\qa\\FreeCRM\\config\\config.properties");
		pro.load(fis);
	}
	
	public static void initilization() {
		String browserName = pro.getProperty("browser");
		String urlName = pro.getProperty("url");
		
		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
			driver= new ChromeDriver();
			
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.pageLoadTimeout, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.implicitlyWait, TimeUnit.SECONDS);
		driver.get(urlName);
		
	}
}
