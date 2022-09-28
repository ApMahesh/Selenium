package seleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actionsexample {

	public static void main(String[] args) throws Exception {

		//mouse over actions
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
	    Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	    //WebElement electronics=driver.findElement(By.xpath("//div[contains(text(),'Electronics')]"));
	    Thread.sleep(5000);
	    Actions p=new Actions(driver);
	    //p.moveToElement(electronics).perform();
	   // Thread.sleep(3000);
	   // driver.findElement(By.xpath("//a[text()='PowerBanks']")).click();
		
	    
	    //double click
	    //WebElement seller=driver.findElement(By.xpath("//span[starts-with(text(),'Become a Seller')]"));
	    //p.doubleClick(seller).build().perform();
	    
	    Thread.sleep(3000);
	    //drag and drop down
	    WebElement from=driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div/div[1]/a/div[2]"));
	    WebElement to=driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div/div[9]/a/div[2]/div/div"));
	    p.dragAndDrop(to, from);
	    Thread.sleep(2000);
	    driver.close();
		
	}

}
