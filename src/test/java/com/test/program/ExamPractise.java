package com.test.program;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ExamPractise {
	
 WebDriver driver;	
	
public ExamPractise(WebDriver driver)
{
	this.driver=driver;
}

public void openUrl()
{
String Url="https://www.cleartrip.com/";
driver.get(Url);
}

public void maximizeWindow()
{
driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
}

public void printUrl()
{
String URL=driver.getCurrentUrl();
System.out.println(URL);

}

}
