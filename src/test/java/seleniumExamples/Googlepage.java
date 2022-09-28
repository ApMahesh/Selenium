package seleniumExamples;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlepage {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ap mahesh\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Create New Account")).click();
        Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-']")).sendKeys("mahesh");
	}

}
