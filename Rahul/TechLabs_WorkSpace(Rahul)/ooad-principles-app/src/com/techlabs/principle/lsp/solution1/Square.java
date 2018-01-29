package com.techlabs.principle.lsp.solution1;

public class Square extends Rectangle{
	//methods
	@Override
	public void setWidth(int widthToSet){
		width= widthToSet;
		height = widthToSet;
	}
	public void setHeight(int heightToSet){
		height= heightToSet;
		width = heightToSet;
	}
}
