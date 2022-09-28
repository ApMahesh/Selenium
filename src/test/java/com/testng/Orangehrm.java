package com.testng;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Orangehrm {
	WebDriver driver;
	
	@Parameters("browserName")
	@BeforeTest
	public void Initilisebrowser(@Optional("chrome") String browsername){
		switch(browsername.toLowerCase()) {
		case("chrome"):
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		break;
		case("edge"):
	    WebDriverManager.edgedriver().setup();
		driver =new EdgeDriver();
		break;
		default:
		System.out.println("browsername is invalid");
		break;
		}
		driver.manage().window().maximize();
		
	}
	@AfterTest
	public void teardown() {
		driver.quit();
	}
	
	@Test(enabled=false)
	@Parameters("url")
	public void Lunchapp(String url){
		driver.get(url);
	}
	
	
	@Test
	@Parameters({"username", "password"})
	public void Enterlogindetails(String username, String password) throws Exception {
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	@Test
   public void verifyMyinfo() {
	 boolean actualresult=driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).isDisplayed();
     assertTrue(actualresult);
	 
	}

	
   @Test
   public void navigatetoAddemployee() throws Exception {
	   driver.findElement(By.xpath("//li[@class='oxd-topbar-body-nav-tab']")).click();
	   Thread.sleep(1000);
   }
   

   
	
	@Test
   public void verifypage()  {
	   WebElement element=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/h6"));
	   assertTrue(element.isDisplayed());
	   assertTrue(element.getText().startsWith("Add Employee"));
	   
   }
	
	
	
	@Test
	public void addEmployee() {
		driver.findElement(By.name("firstName")).sendKeys("Ananda");
		driver.findElement(By.name("middleName")).sendKeys("Mahesh");
		driver.findElement(By.name("lastName")).sendKeys("pulapaka");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	
	@Test
	public void verifyemployee() {
		driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("Ananda Mahesh pulapaka");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		WebElement element=driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[3]"));
		assertTrue(element.getText().startsWith("Ananda"));
		System.out.println(element.getText());
		
	}
	
	
	
}
