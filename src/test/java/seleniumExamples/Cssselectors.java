package seleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Cssselectors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/css-selectors-practice.html");
		driver.findElement(By.cssSelector("input#firstName")).sendKeys("mahesh");
		driver.findElement(By.cssSelector("input.name")).sendKeys("pulapaka");
		driver.findElement(By.cssSelector("input[type=text]")).sendKeys("male");
	}

}
