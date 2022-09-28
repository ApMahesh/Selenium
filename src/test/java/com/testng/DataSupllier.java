package com.testng;

import org.testng.annotations.DataProvider;

public class DataSupllier {

	  @DataProvider()
	  public Object[] TestDataDeatils() {
	      Object[] data=new Object[] {
	    		"mahesh",
	    		"suresh",
	    		"ramesh"
	      
	    };
	      return data;
 }
	  
	  
	  @DataProvider(indices= {0})
	  public Object[] data() {
	      Object[] data=new Object[] {
	    		"Anand",
	    		"pulapaka",
	    		"mahesh"
	      
	    };
	      return data;
 }
}