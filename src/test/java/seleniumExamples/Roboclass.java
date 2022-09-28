package seleniumExamples;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Roboclass {

	public static void main(String[] args) throws Exception {
		

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22536");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'Upload Resume')]")).click();
        Thread.sleep(2000);
        Robot robot=new Robot();
        StringSelection filepath=new StringSelection("C:\\Users\\Ap mahesh\\Pictures\\hrm.png");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath, null);
        robot.keyPress(KeyEvent.VK_CONTROL);
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_V);
        Thread.sleep(2000);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(10000);
        
}
}