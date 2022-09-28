package com.log4j.lib;

import org.openqa.selenium.By;

//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import com.hrms.utility.Log4j;

public class Genral extends Global
{
	//stdrule:To Provide all re-usable fun/methods related to whole application
	public void openApplication() 
	{
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Ap mahesh\\\\eclipse-workspace\\\\chromedriver_win32\\\\chromedriver.exe");
	
	 driver = new ChromeDriver();
	driver.get(url);
	
	System.out.println("Application Opened");
	Reporter.log("Open Application");
	Log.info("Open Application");
	
	}
	public void closeApplication() 
	{
	driver.close();
	System.out.println("Application closed");
	Log.info("Application close");
	}
	public void login() 
	
	{
	driver.findElement(By.name(txt_loginname)).sendKeys(un);
	driver.findElement(By.name(txt_password)).sendKeys(pw);
	driver.findElement(By.name(btn_Login)).click();
	System.out.println("Login completed");
	Log.info("LogIn completed");
	}
	public void logout() 
	{
	driver.findElement(By.linkText(link_logout)).click();
	
	System.out.println("Logout completed");
	Log.info("LogOut Completed");
	
	}
	public void enterFrame() 
	{
	driver.switchTo().frame(frm_empInf);
	System.out.println("Entered into frame");
	}
	public void exitFrame() 
	{
	driver.switchTo().defaultContent();
	System.out.println("Exit from frame");
	}
	public void addNewEmp()
	
	{
	driver.findElement(By.xpath(btn_Add)).click();
	driver.findElement(By.name(txt_FN)).sendKeys(FN);
	driver.findElement(By.name(txt_LN)).sendKeys(LN);
	driver.findElement(By.id(btn_Save)).click();
	System.out.println("New Emp Added");
	}
	
	public void selectdrop()
	{
		Select sl=new Select(driver.findElement(By.name(select_empId)));
	           sl.selectByVisibleText("Emp. ID");
	         driver.findElement(By.name(enter_empId)).sendKeys(select_anyid);
	         driver.findElement(By.xpath(click_searchbtn)).click();
	         driver.findElement(By.name(click_checkedbox)).click();
	         driver.findElement(By.xpath(delete_btn)).click();
	        
	   }

	
	
	
	
	
	

	
}
