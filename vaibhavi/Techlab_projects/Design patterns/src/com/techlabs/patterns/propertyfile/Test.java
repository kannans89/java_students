package com.techlabs.patterns.propertyfile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Test {
	

	public static void main(String[] args) {

		
		Properties props=new Properties();
		try {
			props.load(new FileInputStream("states.properties"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String value=(String)props.get("MH");
		System.out.println(value);
		
		
		
		
	

}
}
