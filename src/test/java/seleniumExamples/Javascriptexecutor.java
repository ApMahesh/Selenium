package seleniumExamples;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Javascriptexecutor {

	public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		WebElement element=(WebElement) jse.executeScript("return document.getElementsByName('username')[0];");
	
	    //for id
	    //docunment.getElementId(' ');
	    //for name
	    //document.getElementsByName('username')[0].value='mahesh';
	    //for classname
	    //document.getElementsByClassName('  ')[0];
	    //for css selector
	    //docunment.querySelector('#  ');
	    //for Xpath
	    //docunment.evaluate(XpathExpression,context,node,namespaceResolver,Resultype,result).singleNodevalue;
	    //for click
	    //docunment.getElementid("    .click()");
	    
	    //for highlighting element
	    //border
	    //document.getElementsByName('username')[0].style.border='20px green solid';
        //background
	    //document.getElementsByName('username')[0].style.background='10px green';
        //for border+background
		//document.getElementsByName('username')[0].setAttribute('style','border:5px red solid;background:background:yellow');


		
		//for scrolling window
		//window.scrollTo(0,600);
        //window.scrollBy(0.500);
        //docunment.getElementByname('  ').scrollintoview;
	    
	
	}
	

}
