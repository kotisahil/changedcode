package com.implement.program;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.test.program.ExamPractise;

public class Runtest {

	WebDriver driver;

	@BeforeMethod
	public void initializeDriver()
	{
	   /* System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
		driver = new ChromeDriver();*/
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
	}

	@Test
	public void executeResult()
	{
	    ExamPractise obj=new ExamPractise(driver);
	    System.out.println("Code changed");
		obj.openUrl();
		obj.maximizeWindow();
		obj.printUrl();

	}

	@AfterMethod
	public void closeDriver()
	{
		driver.quit();	
	}

}

