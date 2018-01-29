package com.techlabs.propertyfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Test {

	public static void main(String[] args) {

		Properties props=new Properties();
		
		try {
			props.load(new FileInputStream("states.properties"));
			System.out.println(props.get("MH"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
