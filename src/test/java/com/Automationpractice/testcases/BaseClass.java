package com.Automationpractice.testcases;

import java.util.concurrent.TimeUnit;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public WebDriver driver;
	public static ThreadLocal<WebDriver> tdriver = new ThreadLocal<WebDriver>();
	
	public WebDriver initialize_driver() {
		 WebDriverManager.chromedriver().setup();
		    driver = new ChromeDriver();
			driver.manage().window().maximize();
			//driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
			System.out.println("Perform Before Method Execution");
		//	driver.get("https://www.amazon.com/");

           tdriver.set(driver);
		    return getDriver();
		
	}
	
	public static synchronized WebDriver getDriver() {
		return tdriver.get();
		
		
	}
	
}
