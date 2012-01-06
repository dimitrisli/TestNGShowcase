package com.dimitrisli.testng.suite;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGSuiteClass1 {

	@Test
	public void method1(){
		System.out.println("From TestNGSuiteClass1 test case");
		Assert.assertTrue(true);
	}
}
