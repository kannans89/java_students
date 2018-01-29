package com.techlabs.dip.solution1;

import com.techlabs.dip.solution2.IExceptionHandler;

public class EmailExceptionHandling implements IExceptionHandler{

	public void handleError(String msg){
		System.out.println("Email printing in progress");
		System.out.println(msg);
	}
}
