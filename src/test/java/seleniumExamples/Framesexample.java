package seleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Framesexample {

	public static void main(String[] args) {
		

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.findElement(By.id("name")).sendKeys("mahesh");
		driver.switchTo().frame("frm3");
		Select select=new Select(driver.findElement(By.id("selectnav1")));
		select.selectByVisibleText("Telugu");
	
		driver.switchTo().frame("frm1");
		Select select1=new Select(driver.findElement(By.id("selectnav1")));
		select1.selectByVisibleText("Alerts");
		driver.switchTo().defaultContent();
	
		
		driver.switchTo().frame("frm2");
		Select select3=new Select(driver.findElement(By.id("selectnav")));
		select3.selectByVisibleText("Home");
		driver.switchTo().defaultContent();
		driver.findElement(By.id("name")).clear();
		driver.findElement(By.id("name")).sendKeys("anand");
		driver.close();
	}

	
}
