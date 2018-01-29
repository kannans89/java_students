package com.techlabs.patterns.crational.simplefactory.ex1;

public class ShapeFactory {
	
	public Shape createShape(ShapeType shape){
		if(shape.equals(ShapeType.CIRCLE)){
			return new Circle();
			
		}else if(shape.equals(ShapeType.RECTANGLE)){
			return new Rectangle();
			
		}else if(shape.equals(ShapeType.TRIANGLE)){
			return new Triangle();
		}
		return null;
	}

}
