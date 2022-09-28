package seleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 class Createnewfacebookaccount {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ap mahesh\\Documents\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569891%7Cb%7Cfacebook%20signin%7C&placement=&creative=589460569891&keyword=facebook%20signin&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221832%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-3821998899%26loc_physical_ms%3D1007740%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=CjwKCAjwu5yYBhAjEiwAKXk_eFAM5dAtO7ShJNUG4MuA_IYaunbJHs8-vpCS1mIwUrx-aHkeTtZMOxoCwnQQAvD_BwE");
        driver.findElement(By.name("firstname")).sendKeys("suresh");
       
       
        driver.findElement(By.name("lastname")).sendKeys("kotikalapudi");
        driver.findElement(By.name("reg_email__")).sendKeys("9985818641");
        driver.findElement(By.name("reg_passwd__")).sendKeys("Mahesh12345");
        driver.findElement(By.name("birthday_day")).sendKeys("26");
        driver.findElement(By.name("birthday_month")).sendKeys("08");
        driver.findElement(By.name("birthday_year")).sendKeys("1998");
        driver.findElement(By.xpath("//input[@name='sex'][@value='2']")).click();
       driver.findElement(By.name("websubmit")).click();
	}

}
