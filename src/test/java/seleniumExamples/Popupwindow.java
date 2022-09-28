package seleniumExamples;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popupwindow {

	public static void main(String[] args) throws Exception {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ap mahesh\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver hdfc=new ChromeDriver();
		
		
		//simple alert
	   hdfc.get("https://netbanking.hdfcbank.com/netbanking/");
		hdfc.switchTo().frame("login_page");
        hdfc.findElement(By.xpath("//a[contains(text(),'CONTINUE')]")).click();
        Alert simple=hdfc.switchTo().alert();
        System.out.println(simple.getText());
        Thread.sleep(2000);
        simple.accept();
        Thread.sleep(2000);
        hdfc.quit();
        
        
        
    	
		//confirmation alert
        WebDriver hyr=new ChromeDriver();
	    hyr.get("https://www.hyrtutorials.com/p/alertsdemo.html");
	    Thread.sleep(1000);
        hyr.findElement(By.xpath("//*[@id=\"confirmBox\"]")).click();
        Alert confirmation=hyr.switchTo().alert();
        System.out.println(confirmation.getText());
        Thread.sleep(2000);
        confirmation.dismiss();
        Thread.sleep(2000);
      
        
        
        
        
	}

}
