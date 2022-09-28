package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Softassert {
	
	@Test
	public void flipkart() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/account/login?ret=%2Fwishlist");
		SoftAssert softassert=new SoftAssert();
		//text assertion
		String actualtext=driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[2]/div/form/div[1]/input")).getAttribute("value");
		String expectedtext="";
		softassert.assertEquals(actualtext, expectedtext);
		
		//error message
		        driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
				String actualerror=driver.findElement(By.xpath("//span[starts-with(text(),'Please')]")).getText();
				String expectederror="Please enter valid Email ID/Mobile number";
				softassert.assertEquals(actualerror, expectederror);
				
				driver.quit();
				
				
	  //border
		//String actualborder=driver.findElement(By.xpath("")).getCssValue("value");
		//Stringe Expectedborder=""
				//softassert.assertEquals(actualborder, Expectedborder);
//note:when you use selenium driver get the border the value covert into hex to rgv and give some space
	}

}
