package seleniumExamples;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import com.google.common.io.Files;


public class Screenshots {

	public static void main(String[] args) throws IOException  {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ap mahesh\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver google=new ChromeDriver();
		
		google.get("https://www.google.com/");
	    TakesScreenshot ts=(TakesScreenshot)google;
	    File file=ts.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(file, new File("./Screenshots/image1.png"));
	    google.quit();
	}

}
