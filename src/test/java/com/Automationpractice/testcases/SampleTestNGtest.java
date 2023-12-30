package com.Automationpractice.testcases;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.firefox.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import io.qameta.allure.Story;



/*
 * @BeforeSuite
 * @BeforeTest
 * @BeforeClass
 * @BeforeMethod
 * @Test
 * @Test
 * @AfterMethod
 * @AfterClass
 * @AfterTest
 * @AfterSuite
 */

public class SampleTestNGtest {
	
	WebDriver driver;
	WebDriver driver1;
	
	
	 @SuppressWarnings("deprecation")
	 @BeforeMethod()
	public void initialsetup(){
		 
	    WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		System.out.println("Perform Before Method Execution");
		
		 WebDriverManager.firefoxdriver().setup();
		 driver1 = new FirefoxDriver();
		 driver1.manage().window().maximize();
		 driver1.manage().deleteAllCookies();
		 driver1.manage().timeouts().pageLoadTimeout(50,TimeUnit.SECONDS);
		
	 }
	 

	  @AfterMethod
	 public void teardown()
	 {
		  /*try {
		        // Close or quit the WebDriver instance
			  Thread.sleep(8000);
		        if (driver != null) {
		            driver.close();
		            System.out.println("WebDriver quit successfully.");
					//driver.manage().timeouts().implicitlyWait(20, java.util.concurrent.TimeUnit.SECONDS);

		        }
		    } catch (Exception e) {
		        System.err.println("Exception during WebDriver quit: " + e.getMessage());
		    } */
		    
          driver.quit();

			

	 }
	 
	 @Test(priority=3)
	 @Description("Verify chrome browser launch...")
	 @Epic("Verify chrome browser launch Epic")
	 @Feature("Feature1:Verify chrome browser launchfeature")
	 @Story("Story3: Verify chrome browser launch story level")
	@Step("Step3:  Verify chrome browser launch step level") 
	public void ChromeAuto() {
		 
			//WebDriver driver = new ChromeDriver();
			driver.get("https://demo.automationtesting.in/Register.html");
			
			driver.manage().timeouts().implicitlyWait(20, java.util.concurrent.TimeUnit.SECONDS);

		WebElement searchelement =	driver.findElement(By.xpath("//input[@placeholder='First Name']"));
			
			
			System.out.println("Verify this element is Displayed " +searchelement.isDisplayed());
			System.out.println("Verify this element is Enabled " +searchelement.isEnabled());
			
			
		WebElement genderm = driver.findElement(By.xpath("//input[@value='Male']"));
		WebElement genderf = driver.findElement(By.xpath("//input[@value='FeMale']"));
		System.out.println("Male itme is selected or not " +genderm.isSelected());
		System.out.println("Female itme is selected or not " +genderf.isSelected());

		     genderm.click();
		      
		  //  System.out.println("Male itme is selected or not " +genderm.isSelected());
		 // 	System.out.println("Female itme is selected or not " +genderf.isSelected());
		  
		  	 genderf.click();
		      
			//    System.out.println("Male itme is selected or not " +genderm.isSelected());
			//  	System.out.println("Female itme is selected or not " +genderf.isSelected());
			  	
				System.out.println("Perform Chrome browser testcase execution");
				driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
				driver.close();
				


	 }
	 
	@SuppressWarnings("deprecation")
	@Test(priority=1)
	public void EdgeAuto()
	{
		//WebDriverManager.edgedriver().setup();
		
		//driver1.get("https://demo.automationtesting.in/Register.html");
		//driver1.manage().timeouts().implicitlyWait(30, java.util.concurrent.TimeUnit.SECONDS);

		driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);

		driver1.get("https://www.snapdeal.com/");
		driver1.manage().timeouts().implicitlyWait(50, java.util.concurrent.TimeUnit.SECONDS);

		driver1.navigate().back();
		
		driver1.navigate().forward();
		
		driver1.navigate().refresh();
		System.out.println("Perform Edge browser testcase execution");
		driver.close();

	}
	
	@Test(priority=2)
	public void GoogleLaunch()
	{
		
		driver.get("https://www.google.com/");
		WebElement element = driver.findElement(By.id("APjFqb"));
		           element.sendKeys("Sample Automation Interview Questions");
		           element.sendKeys(Keys.ENTER);
		
		           driver.close();
		  
		
		
				
	} 
	
	 
	 
}
