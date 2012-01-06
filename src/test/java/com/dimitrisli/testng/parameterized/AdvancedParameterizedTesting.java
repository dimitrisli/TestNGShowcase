package com.dimitrisli.testng.parameterized;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AdvancedParameterizedTesting {

	public static class Bean{
		private String val;
		private int i;
		
		public Bean(String val, int i){
			this.val=val;
			this.i=i;
		}
		
		public String getStr(){
			return this.val;
		}
		
		public int getInt(){
			return this.i;
		}
		
	}
	
	@DataProvider(name = "advancedParameterizedMethod")
	public Object[][] advancedParameterizedMethod(){
		return new Object[][]{{new Bean("hi I am the bean",111)}};
	}
	
	@Test(dataProvider="advancedParameterizedMethod")
	public void testMethod(Bean myBean){
		System.out.println(myBean.getStr()+" "+myBean.getInt());
	}
}
