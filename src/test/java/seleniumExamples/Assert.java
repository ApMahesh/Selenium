package seleniumExamples;




import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assert {

	public static void main(String[] args) throws Exception {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://en.wikipedia.org/wiki/Main_Page");
       driver.findElement(By.name("search")).sendKeys("India",Keys.ENTER);
		

	}

}
