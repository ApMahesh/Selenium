package com.testng;

import org.testng.annotations.Test;

public class TestDependency {
	static String trackingNumber=null;
	
	@Test
	public void Createshipment() {
	
		System.out.println("Createshipment");
		trackingNumber = "abc123def";
	}
	
	@Test(dependsOnMethods= {"Createshipment"}) //if you dependent test is failed when you want execute then will add alwaysrun=true                                            //
	public void Trackshipment() throws Exception{
		if(trackingNumber !=null)
		System.out.println("Trackshipment");
		else
			throw new Exception("Invalid tracking Number");
		
	}
	
	@Test(dependsOnMethods= {"Createshipment","Trackshipment"})
	public void Cancelshipment() throws Exception {
		

		if(trackingNumber !=null)
			System.out.println("Cancelshipment");
			else
				throw new Exception("Invalid trackingNumber");
	}
//if you ignored/skipped/deleted even if you want execute the method
//ignoreMissingDependencies=true
}
