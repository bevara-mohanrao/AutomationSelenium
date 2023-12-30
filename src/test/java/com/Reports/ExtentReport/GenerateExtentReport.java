package com.Reports.ExtentReport;

import java.io.File;

import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class GenerateExtentReport {

	ExtentReports extent;
	ExtentTest test;
	
	@BeforeTest
	public void startReport()
	{
		
	//	extent = new ExtentReports(System.getProperty("user.dir") +"/Reports/Testreport.html");
		extent.setSystemInfo("Host Name","LocalHost");
		extent.setSystemInfo("Environment", "QA");
		extent.setSystemInfo("User Name", "Mohan");
		//extent.loadConfig(new File(System.getProperty("user.dir")+ "\\extent-config.xml");
	}
}
