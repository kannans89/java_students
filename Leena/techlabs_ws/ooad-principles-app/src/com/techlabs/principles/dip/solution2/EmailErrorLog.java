package com.techlabs.principles.dip.solution2;

public class EmailErrorLog implements IErrorLog{

	@Override
	public void handleError(String msg){
		System.out.println(msg+" has ocurred");
		System.out.println("Error is showing in EMAIL file");
		System.out.println("leena.khetle@gmail.com");
		
	}
}
