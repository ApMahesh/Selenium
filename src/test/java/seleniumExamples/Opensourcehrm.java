package seleniumExamples;


import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Opensourcehrm {

	public static void main(String[] args)throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ap mahesh\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver hrm=new ChromeDriver();
		hrm.get("http://183.82.103.245//nareshit/login.php");
		Thread.sleep(3000);
		hrm.findElement(By.name("txtUserName")).sendKeys("nareshit");
		hrm.findElement(By.name("txtPassword")).sendKeys("nareshit");
		hrm.findElement(By.name("Submit")).click();
		hrm.switchTo().frame("rightMenu");
		Thread.sleep(2000);
		WebElement select=hrm.findElement(By.name("loc_code"));
		Select name=new Select(select);
		name.selectByIndex(1);
		hrm.findElement(By.xpath("//input[@type='text']")).sendKeys("4341");
		hrm.findElement(By.xpath("//input[@value='Search']")).click();
	
		//hrm.findElement(By.xpath("//input[@onclick='clear_form();']")).click();
	}

  
}