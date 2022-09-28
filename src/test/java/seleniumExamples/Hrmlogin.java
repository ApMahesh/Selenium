package seleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hrmlogin {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ap mahesh\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://183.82.103.245//nareshit/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id=\"option-menu\"]/li[3]/a")).click();

	}

}
