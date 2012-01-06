package com.dimitrisli.testng.parameterized;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTesting {

	@DataProvider(name="dataProviderMethod")
	public Object[][] parameterMethod(){
		return new Object[][]{{"one",1},{"two",2}};
	}
	
	@Test(dataProvider="dataProviderMethod")
	public void testMethod(String str, int val){
		System.out.println("str="+str+", val="+val);
	}
}
