package com.FreeCRM.util;

import java.io.IOException;

import com.qa.FreeCRM.base.TestBase;

public class TestUtil extends TestBase {


	public TestUtil() throws IOException {
		
	}

	public static long pageLoadTimeout=20 ;
	public static long implicitlyWait=10;
	
	public void sitchingframe() {
		driver.switchTo().frame("mainpanel");
	}
}
