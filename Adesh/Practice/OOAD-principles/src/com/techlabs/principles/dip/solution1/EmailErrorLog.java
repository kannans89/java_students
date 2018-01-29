package com.techlabs.principles.dip.solution1;

public class EmailErrorLog {

	public void errorHandler(String msg){
		System.out.println("Error is handling via Email");
		System.out.println("admin:abc@12");
		System.out.println(msg);
	}
}
