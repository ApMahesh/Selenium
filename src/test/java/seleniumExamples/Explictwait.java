package seleniumExamples;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Explictwait {

	public static void main(String[] args) {
	
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testproject.io/#");
		String parentwindow=driver.getWindowHandle();
		driver.findElement(By.xpath("//a[@title='Forum']")).click();
		Set<String> childwindows=driver.getWindowHandles();
		for(String childwindow : childwindows)
		{
			if(!childwindow.equals(parentwindow)) {
				driver.switchTo().window(childwindow);
				driver.findElement(By.xpath("//span[starts-with(text(),'Login')]")).click();
        		WebDriverWait wait=new WebDriverWait(driver, 10);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
				driver.findElement(By.id("username")).sendKeys("mahesh");
				driver.quit();
			}
			
		}
		/*
Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
  .withTimeout(Duration.ofSeconds(30))
  .pollingEvery(Duration.ofSeconds(5))
  .ignoring(NoSuchElementException.class);

WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
  public WebElement apply(WebDriver driver) {
    return driver.findElement(By.id("foo"));
  }
});*/
  

	}

}
