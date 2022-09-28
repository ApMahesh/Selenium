package seleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selectdropdowns {

	public static void main(String[] args) throws Exception {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		Thread.sleep(3000);
        WebElement fashion=driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[4]/a/div[2]/div/div"));
        Select dropdown=new Select(fashion);
        dropdown.selectByIndex(1);
	}

}
