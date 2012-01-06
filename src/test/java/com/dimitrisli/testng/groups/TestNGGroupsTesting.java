package com.dimitrisli.testng.groups;

import org.testng.annotations.Test;

public class TestNGGroupsTesting {

	@Test(groups="group3")
	public void method1(){
		System.out.println("inside method1 of group 3");
	}
	
	@Test(groups="group1")
	public void method2(){
		System.out.println("inside method2 of group 1");
	}
	
	@Test(groups="group2")
	public void method3(){
		System.out.println("inside method3 of group 2");
	}
	
	@Test(groups="group2")
	public void method4(){
		System.out.println("inside method4 of group 2");
	}
	
	@Test(groups="group1")
	public void method5(){
		System.out.println("inside method5 of group 1");
	}
}
