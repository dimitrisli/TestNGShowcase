package com.dimitrisli.testng.beforeAfter;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class TestNGBeforeAfterTesting {

	@BeforeSuite
	public static void initialiseSuite(){
		System.out.println("init suite");
	}

	@BeforeClass
	public static void initialiseClass(){
		System.out.println("init class");
	}
	
	@BeforeMethod
	public void initialiseTest(){
		System.out.println("init test");
	}
	
	@Test
	public void test1(){
		System.out.println("inside test1");
		Assert.assertTrue(true);
	}

	@Test
	public void test2(){
		System.out.println("inside test2");
		Assert.assertTrue(true);
	}
	
	@AfterMethod
	public void teardownTest(){
		System.out.println("teardown test");
	}
	
	@AfterClass
	public static void teardownClass(){
		System.out.println("teardown class");
	}
	
	@AfterSuite
	public static void teardownSuite(){
		System.out.println("teardown suite");
	}
}
