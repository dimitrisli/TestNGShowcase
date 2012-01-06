package com.dimitrisli.testng.suite;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGSuiteClass2 {

	@Test
	public void method1(){
		System.out.println("From TestNGSuiteClass2 test case");
		Assert.assertTrue(true);
	}
}
