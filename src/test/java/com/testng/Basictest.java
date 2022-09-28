package com.testng;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basictest {
	public static WebDriver  driver;
	@BeforeTest
	public void setup() {
		WebDriverManager.chromedriver().setup();
	   driver =new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	
	
	@AfterTest
     public void teardown() {
		driver.quit();
		
	}
	
	public void CaptureScreenshots(String filename)  {
		TakesScreenshot takescreenshot = (TakesScreenshot) driver;
		File sourceFile =  takescreenshot.getScreenshotAs(OutputType.FILE);
		File destFile = new File("C:\\Users\\Ap mahesh\\eclipse-workspace\\Screenshots\\img1.jpg"+filename);
		try {
		FileUtils.copyFile(sourceFile, destFile);
		} catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("Screenshot saved successfully");
	
	}

}
