package com.testng;

import org.testng.annotations.Test;

public class Priority {
	
	@Test(groups= {"sanity"})
	public void method1() {
		System.out.println("mehod1");
	}

	@Test(groups= {"smoke"})
	public void method2() {
		System.out.println("method2");
	}

	@Test(groups= {"smoke"})
	public void method3() {
		System.out.println("mehod3");
	}

	@Test(groups= {"sanity"})
	public void method4() {
		System.out.println("mehod4");
	}

}
