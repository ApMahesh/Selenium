package seleniumExamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Implictwait {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
		driver.findElement(By.id("btn1")).click();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.findElement(By.id("txt1")).sendKeys("mahesh");

	}

}
