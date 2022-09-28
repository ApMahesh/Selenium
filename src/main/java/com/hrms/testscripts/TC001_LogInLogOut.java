package com.hrms.testscripts;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.log4j.lib.Genral;

public class TC001_LogInLogOut 
{
	@Test
   public void TC001()

	{
		  DOMConfigurator.configure("log4j.xml");
          Genral obj= new  Genral();
           obj.openApplication();
           obj.login();
           obj.logout();
           obj.closeApplication();
           
           
           
           
           
      }
      
    
}
