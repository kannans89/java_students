package com.techlabs.lsp.solution1;

public class Square extends Rectangle{
	
	@Override
	public void setWidth(int width){
		this.width=width;
		this.length=width;
	}
	
	@Override
	public void setLength(int length){
		this.length=length;
		this.width=length;
	}
	
}
