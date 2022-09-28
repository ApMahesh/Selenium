package seleniumExamples;

import java.util.concurrent.TimeUnit;

import org.apache.hc.core5.util.Timeout;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Pageloadtimeout {

	public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(3,TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.close();
	
	}

}
