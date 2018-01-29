package com.techlabs.rectangle;

public class Rectangle {
	private int width;
	private int height;
	private String color;
	
	public void fillColor(String pcolor){
		if(pcolor.equalsIgnoreCase("Red") || pcolor.equalsIgnoreCase("Green") || pcolor.equalsIgnoreCase("Blue")){
			color = pcolor;
		}
		else 
			color="Red";
		
	}
	
	public void setWidth(int pwidth){
		
		if(pwidth<0){
			width = 0;
		}
		else
			width=pwidth;
			
	}
	
	public void setHeight(int pheight) {
		
		if(pheight<0){
			height = 0;
		}
		else
			height=pheight;
						
	}
	
	public int calcArea() {
		
		return (height*width);
	
	}
	
	public int calcPerimeter() {
		
		return (2*(height+width));
	
	}
	
	public String getColor() {
		
		return color;
	}
	
	public int getWidth() {
		return width;
		
	}
	
	public int getHeight() {
		return height;
		
	}

}
