package com.dimitrisli.testng.parameterized;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizedInjectionTest {

	@Test
	@Parameters(value="i")
	public void method1(int i){
		System.out.println("inside method1() of parameterized example injected i = "+i);
	}
}
