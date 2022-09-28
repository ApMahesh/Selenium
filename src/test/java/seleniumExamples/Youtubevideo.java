package seleniumExamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Youtubevideo {

	public static void main(String[] args) throws Exception {

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.youtube.com/results?search_query=hyr+tutorials");
		WebDriverWait wait=new WebDriverWait(driver, 150);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"video-title\"]"
				+ "/yt-formatted-string")));
		driver.findElement(By.xpath("//*[@id=\"video-title\"]/yt-formatted-string")).click();
	    //click on skip add
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ad-text:7\"]")));
		driver.findElement(By.xpath("//*[@id=\"ad-text:7\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"movie_player\"]/div[35]/div[2]/div[1]/button")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id=\"movie_player\"]/div[34]/div[2]/div[1]/span/button")).click();
		
	}

}
