package com.dimitrisli.testng.exceptionTesting;

import org.testng.annotations.Test;


public class ExceptionsTesting {

	@Test(expectedExceptions = NullPointerException.class)
	public void method(){
		throw new NullPointerException();
	}

	@Test(expectedExceptions = IllegalArgumentException.class)
	public void method2(){
		throw new IllegalArgumentException();
	}
}
