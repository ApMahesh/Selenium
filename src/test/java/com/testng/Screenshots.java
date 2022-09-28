package com.testng;

import  org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;
import org.openqa.selenium.By;

@Listeners({ITestListner.class})
public class Screenshots extends Basictest {
	
	
	@Test(testName="loginhrm")
	public void loginhrm() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		String Expectedresult="OrangeHR";
		String actualresult=driver.getTitle();
		Assert.assertEquals(Expectedresult, actualresult);
		//assertNotEquals(Expectedresult,actualresult);
		
	}
	
	@Test(testName="facebook")
	public void facebook() {
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("login")).click();
		String actualresult=driver.getTitle();
		assertTrue(true, actualresult);
	}

}
