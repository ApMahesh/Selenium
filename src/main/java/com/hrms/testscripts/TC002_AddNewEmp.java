package com.hrms.testscripts;
import org.apache.log4j.xml.DOMConfigurator;


import org.testng.annotations.Test;

import com.log4j.lib.Genral;


public class TC002_AddNewEmp 
{
	@Test
	public void TC002()
	
	//public void main(String args[])
	{
		  DOMConfigurator.configure("log4j.xml");
		Genral obj= new Genral();
		obj.openApplication();
		obj.login();
		obj.enterFrame();
		obj.addNewEmp();
		obj.exitFrame();
		obj.logout();
		obj.closeApplication();
		
		
		
	}

}
