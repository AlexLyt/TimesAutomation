package com.testNGdata;

import org.testng.annotations.DataProvider;

public class DataFile {
	
	@DataProvider(name="pages")
	public static Object [][] pages() {
		return new Object [][] {
				
				{"https://www.facebook.com", "Facebook - Log In or Sign Up"},
				{"https://www.google.com","Google"},
				{"https://www.yahoo.com","Yahoo"},
				
		};
		
	}
		
	
	

}
