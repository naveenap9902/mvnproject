package com.crm.Comcast_MVN;

import org.testng.annotations.Test;

public class DynamicDatapassTest 
{
	@Test
	public void dynamicdatapassTest()
	{
		String URL = System.getProperty("url");
		System.out.println(URL);
		
		String BROWSER = System.getProperty("browser");
		System.out.println(BROWSER);	
	}
}
