package com.testng;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class PartiallyDataProvider {
  @Test(dataProvider = "data",dataProviderClass=DataSupllier.class)
  public void method(Object s) {
	  System.out.println(s);
  }


  }

