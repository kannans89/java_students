package com.techlab.propertyFile;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class SetProperty {

	public static void main(String[] args) throws IOException {
		  
		Properties p=new Properties();  
		p.setProperty("name","Pratibha Dhodi");  
		p.setProperty("email","dhodipd@gmail.com");  
		  
		p.store(new FileWriter("info.properties"),"Javatpoint Properties Example");  
		  
	 
		
	}

}
