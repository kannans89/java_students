package com.techlabs.lsp.solution1;

public class Square extends Rectangle{
	
	@Override
	public void setWidth(int w)
	{
		this.width=w;
		this.height=w;
	}
	
	@Override
	public void setHeight(int h)
	{
		this.height=h;
		this.width=h;
	}

}
