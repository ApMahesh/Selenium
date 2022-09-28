package com.testng;

import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.testng.annotations.DataProvider;

public class ParameterofDataprovider {
  @Test(dataProvider = "TestData")
  public void method(Object[] s) throws Exception {
	  System.out.println(s[0] +">>>>"+s[1]);
	 // System.out.println(username  + ">>>" +password);
	 // for(int i=0;i<s.length;i++) {
	//	  System.out.println(s[i]);
	 // }
	   
	  //System.out.println(">>>");
  }

  @DataProvider
  public Iterator<Object[]> TestData() {
   Set<Object[]> data=new HashSet<>();
	   data.add(new Object[] {"mahesh","annafa"});
	   data.add(new Object[] {"anand",1234});
	   return data.iterator();
   
   
  }
}
