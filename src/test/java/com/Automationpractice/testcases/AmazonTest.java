package com.Automationpractice.testcases;

import org.testng.annotations.Test;

import org.testng.annotations.Parameters;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import io.qameta.allure.Story;

import org.openqa.selenium.support.ui.WebDriverWait;

@Test()


//@Listeners(AllureListener.class)
public class AmazonTest extends BaseClass {
	
	public WebDriver driver;

	
	@BeforeMethod
	public void amazonsetup() {
	
	
	   WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		System.out.println("Perform Before Method Execution");  
		//BaseClass  bs =  new BaseClass();
		//bs.initialize_driver();
	
		
 

}
	@Test(priority=1, description="Amazon login access account verification TestNG")
	
	@Description("Amazon login account access...")
	@Epic("Epic level: Amazon access accounts")
	@Feature("Feature1: Login access acount feature")
	@Story("Story1: Verify login success account")
	@Step("Step: Verify login success step to test")
	
	@Parameters({"url","emailid","password"})
	public void amsazonlogin(String url,String emailid,String password){
		
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.get(url);
	//	driver.get(url);
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		WebElement loginlink = driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
		           loginlink.isEnabled();
		           loginlink.click();     
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys(emailid);
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		System.out.println("Amazon login for intial test case successfull");
		
        WebElement ordershistory = driver.findElement(By.xpath("//span[normalize-space()='& Orders']"));

        ordershistory.click();
  	   driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

        String actual= driver.getTitle();
      //  String expected ="Your Title";
        Assert.assertEquals(actual, "Your Orders", "This is not expected Title"); 
   	   driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);

     boolean logo= driver.findElement(By.xpath("//img[@alt='Apple iPhone 13 Pro, 256GB, Graphite - Unlocked (Renewed)']")).isDisplayed();
       // Assert.assertTrue(logo);
        Assert.assertEquals(logo, true,"Image should be visible iphone13 pro :) ");
        
	}
			
	@Test(priority=3,dependsOnMethods="amsazonlogin")
	@Description("Amazon Search product...")
	@Epic("Epic level: Amazon Search")
	@Feature("Feature:Search amazon  products")
	@Story("Story2: Search specific products")
	@Step("Step2:  Search specific products")
	public void amazonsearchTest() {
		
		try {
			
    		Thread.sleep(4000);

  		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		  WebElement Amzsearch = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		
          Amzsearch.sendKeys("Iphone 13 charger");
          Amzsearch.sendKeys(Keys.ENTER);
  		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		}
		catch(Exception e)
		{
			System.out.println("Exception errot thrown" +e.getMessage() );
		}
		driver.quit();
	} 
	

	@Test(priority=2,dependsOnMethods="amsazonlogin")
	@Description("Verify Amazon Title after login success...")
	@Epic("Amazon site titles")
	@Feature("Feature3: Search all amazon page titles")
	@Story("Story3: Search amazon all titles to verify")
	@Step("Step3:  Search amazon all titles to verify step level")
	
	public void AmazonprimeTest() throws InterruptedException {
		
		try
		{
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        //WebElement Searchdrpbox = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='searchDropdownBox']")));
       // WebElement ordershistory = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='& Orders']")));
        
        WebElement ordershistory = driver.findElement(By.xpath("//span[normalize-space()='& Orders']"));
        
      //span[normalize-space()='& Orders']
        ordershistory.click();
 	   driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

       String actual= driver.getTitle();
       String expected ="Your Title";
       
       if(actual.equals(expected))
       {
    	   System.out.println("Title is passed and expected");
       }
       else 
       {
    	   System.out.println("Title is failed and not expected");
       }   
       }
       catch(Exception e)
		{
			System.out.println("Exception errot thrown" +e.getMessage() );
		}
       
        
        
	 /*   //Select drpSelect = new Select(Searchdrpbox);
	   for(WebElement option: drpSelect.getOptions())
	   {   
	      System.out.println(option.getText());
	   }
	   drpSelect.selectByVisibleText("Baby");
	   driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click(); 
	   driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	   System.out.println("Amazon search dropdown with all options"); */

	}
	
	@AfterMethod
	public void postcompletion() {
		
		driver.quit();
		System.out.println("Complete After Method execution");
	}
	
}
