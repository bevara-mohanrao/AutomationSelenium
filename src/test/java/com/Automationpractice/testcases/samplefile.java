package com.Automationpractice.testcases;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.*;


public class samplefile {

	@SuppressWarnings("deprecation")
	@Test

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
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
	      
	    System.out.println("Male itme is selected or not " +genderm.isSelected());
	  	System.out.println("Female itme is selected or not " +genderf.isSelected());
	  
	  	 genderf.click();
	      
		    System.out.println("Male itme is selected or not " +genderm.isSelected());
		  	System.out.println("Female itme is selected or not " +genderf.isSelected());
		      
	       driver.quit();
	       
	       
	       // Using get() method and navigate().to() method.
	       
	       
			WebDriverManager.edgedriver().setup();
			WebDriver driver1 = new EdgeDriver();
			
			driver1.get("https://demo.automationtesting.in/Register.html");
			driver1.manage().timeouts().implicitlyWait(30, java.util.concurrent.TimeUnit.SECONDS);

			driver1.get("https://www.snapdeal.com/");
			driver1.manage().timeouts().implicitlyWait(30, java.util.concurrent.TimeUnit.SECONDS);

			driver1.navigate().back();
			
			driver1.navigate().forward();
			
			driver1.navigate().refresh();
			
			driver1.quit();
			
	}
}

