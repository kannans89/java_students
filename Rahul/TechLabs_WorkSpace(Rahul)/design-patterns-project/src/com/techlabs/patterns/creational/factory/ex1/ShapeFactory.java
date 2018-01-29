package com.techlabs.patterns.creational.factory.ex1;

public class ShapeFactory {
	
	
//Methods
	public static Shape createShape(ShapeType currentShape){
		if(currentShape.equals(ShapeType.CRICLE)){
			return new Circle();
		}
		
		else if(currentShape.equals(ShapeType.TRIANGLE)){
			return new Triangle();
		}
		else if(currentShape.equals(ShapeType.RECTANGLE)){
			return new Rectangle();
		}
		else {
			return null;
		}
			
		}
		
	}

