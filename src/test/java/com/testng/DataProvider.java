package com.testng;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProvider {
	
	@Test(dataProvider="logindata")
	public void hrmlogin(String username, String password) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).isDisplayed());
		Thread.sleep(3000);
		driver.quit();
	}	
		
		
 @org.testng.annotations.DataProvider()
 public Object[][] logindata() {
	  Object[][] data=new Object[2][2];
	  data[0][0] = "Admin";
	  data[0][1] = "admin123";
	  
	  data[1][0] = "Admin";
	  data[1][1] ="ncddne";
	  
	  return data;
	}
	
//in case u does not provide dataprovider name u can use method name
	

}
