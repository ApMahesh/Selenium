package seleniumExamples;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Keyboardfunctions {

	public static void main(String[] args) throws Exception {
	

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("snapdeal");
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		WebElement shop=driver.findElement(By.xpath("//span[starts-with(text(),'Snapdeal')]"));
		Actions search=new Actions(driver);
		search.doubleClick(shop).build().perform();
		WebElement enter=driver.findElement(By.name("keyword"));
		enter.sendKeys("men slippers");
	     robot.keyPress(KeyEvent.VK_ENTER);
	     robot.keyRelease(KeyEvent.VK_ENTER);
		
	}

}
