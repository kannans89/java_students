package com.techlabs.principles.dip.solution2;

public class XMLErrorLog implements IErrorLog{

	@Override
	public void handleError(String msg){
		System.out.println(msg+" error has ocurred");
		
	}

}
