package com.testng;

import static org.testng.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hardassertexamples {
	
	@Test(enabled=false)
	public void loginhrm() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://183.82.103.245//nareshit/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		driver.findElement(By.name("Submit")).click();
		String Expectedresult="OrangeHR";
		String actualresult=driver.getTitle();
		//assertEquals(Expectedresult, actualresult);
		assertNotEquals(Expectedresult,actualresult);
		driver.quit();
		}

	@Test
     public void facebook() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.findElement(By.name("login")).click();
		String actualresult=driver.getTitle();
		assertTrue(true, actualresult);
		//assertFalse(false,actualresult);
		driver.quit();
	}
	//assertnull
	//aseertnotnull
}
