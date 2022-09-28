package seleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Containsandstartswith {

	public static void main(String[] args) {

		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ap mahesh\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver gmail=new ChromeDriver();
        gmail.get("https://accounts.google.com/accountchooser/identifier?flowName=GlifWebSignIn&flowEntry=AccountChooser");
	    gmail.findElement(By.xpath("//span[starts-with(text(),'Create')]")).click();
	    gmail.findElement(By.xpath("//li[@jsname='RZzeR']")).click();
	    
	
}
}