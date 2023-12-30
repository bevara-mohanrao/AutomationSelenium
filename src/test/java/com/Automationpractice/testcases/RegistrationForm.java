package com.Automationpractice.testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Utility.XLUtility.XLUtility;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import io.qameta.allure.Story;

public class RegistrationForm {
	
	WebDriver driver;
	
	
	@SuppressWarnings("deprecation")
	@BeforeTest()
	public void PreSetup() {
		
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
	}
	
	
	@DataProvider(name="signupData")
	public String [][] ReadDataFile() throws IOException
	{
		
		
		String path = ".\\TestData\\ebaysignup.xlsx";
		
		XLUtility xlutil = new XLUtility(path);
		
		int totalrows = xlutil.getRowCount("ebaysignup");
		int totalcols = xlutil.getCellCount("ebaysignup", 1);
		
		String signupData [][] = new String[totalrows][totalcols];
		
		for(int i=1;i<=totalrows;i++)
		{
			for(int j=0;j<totalcols;j++)
			{
				
				signupData[i-1][j] = xlutil.getCellData("ebaysignup", i, j);
			}
		}
			
		return signupData;
		
	}
	
	
	@Test(dataProvider="signupData")
	@Description("Verify ebay registration success...")
	@Epic("ebay registration process")
	@Feature("Feature1: ebay registration process feature")
	@Story("Story3: ebay registration process story level")
	@Step("Step3:  ebay registration process step level")
	public void registerform(String firstname,String lastname,String email,String password) throws InterruptedException
	{
		
		driver.get("https://scgi.half.ebay.com/ws/eBayISAPI.dll?RegisterEnterInfo&usage=2943&ru=");

		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='firstname']")).clear();
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys(firstname);
	
		driver.findElement(By.xpath("//input[@id='lastname']")).clear();
		driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys(lastname);
		
		driver.findElement(By.xpath("//input[@id='Email']")).clear();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(email);
		
		driver.findElement(By.xpath("//input[@id='password']")).clear();
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		
	}
	
	@AfterTest
	public void postprocess()
	{
	
		driver.close();
	}
	

}
