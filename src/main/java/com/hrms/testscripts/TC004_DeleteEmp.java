package com.hrms.testscripts;

import org.apache.log4j.xml.DOMConfigurator;

import org.testng.annotations.Test;

import com.log4j.lib.Genral;



public class TC004_DeleteEmp 
{
	//public static void main(String args[])
	@Test
	public void TC004()
	{
		DOMConfigurator.configure("log4j.xml");
		Genral obj=new Genral();
		obj.openApplication();
		obj.login();
		obj.enterFrame();
		obj.selectdrop();
		obj.exitFrame();
		obj.logout();
		obj.closeApplication();
		
		
		
		
	}
	

}
