package seleniumExamples;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handlemultiplewindows {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
  
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		
		//single window
//		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
//		String parentwindowhandle=driver.getWindowHandle();
//		driver.findElement(By.id("newWindowBtn")).click();
//		Set<String>windowhandles=driver.getWindowHandles();
//		for(String Windowhandle:windowhandles)
//		{
//			if(!Windowhandle.equals(parentwindowhandle))
//			driver.switchTo().window(Windowhandle);
//			driver.manage().window().maximize();
//			driver.findElement(By.id("firstName")).sendKeys("mahesh");
//			Thread.sleep(3000);
//			driver.close();
//		}
//		driver.switchTo().window(parentwindowhandle);
//		driver.quit();
		
		
		
		//single tab
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		String parentwindowhandle=driver.getWindowHandle();
     	driver.findElement(By.id("newTabBtn")).click();
    	Set<String>windowhandles=driver.getWindowHandles();	
     	for(String Windowhandle:windowhandles)
     	{
			if(!Windowhandle.equals(parentwindowhandle))
			driver.switchTo().window(Windowhandle);
			driver.findElement(By.id("alertBox")).click();
			Thread.sleep(3000);
			driver.close();
		}
		
		driver.switchTo().window(parentwindowhandle);
		//driver.quit();
		
	}

}
