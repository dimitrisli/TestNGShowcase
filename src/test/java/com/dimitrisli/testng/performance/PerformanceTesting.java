package com.dimitrisli.testng.performance;

import org.testng.Assert;
import org.testng.annotations.Test;



public class PerformanceTesting {

	@Test(timeOut=100)
	public void method(){
		Assert.assertTrue(true);
	}
}
