package seleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ap mahesh\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Ap%20mahesh/Downloads/XpathExample.html");
		driver.findElement(By.name("field1")).sendKeys("");
		driver.findElement(By.name("password")).sendKeys("");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//input[@type='button']")).click();
		
	}
	

}
