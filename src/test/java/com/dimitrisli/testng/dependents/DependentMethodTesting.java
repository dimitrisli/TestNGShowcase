package com.dimitrisli.testng.dependents;

import org.testng.annotations.Test;

public class DependentMethodTesting {

	@Test(dependsOnMethods={"method1"})
	public void method2(){
		System.out.println("hi I am method2 and I depend on method1");
	}
	
	@Test
	public void method1(){
		System.out.println("hi I am method1");
	}
}
