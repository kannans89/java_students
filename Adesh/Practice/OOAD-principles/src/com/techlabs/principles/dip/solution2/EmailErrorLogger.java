package com.techlabs.principles.dip.solution2;

public class EmailErrorLogger implements IErrorLog{

	public void errorHandler(String msg) {
		System.out.println("Error is handling via Email");
		System.out.println("admin:abc@12");
		System.out.println(msg);
	}

}
