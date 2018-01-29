package com.techlabs.rectangle.test;

import com.techlabs.rectangle.Rectangle;

public class RectangleTest {
	
	public static void main(String [] aStrings) {

		shouldFillColorTest();
		shouldSetWidthTest();
		shouldSetHeightTest();
		shouldCalcAreaTest();
		shouldCalcPerimeterTest();
		rectangleAssignmentTest();
		anonymousRectangleTest();

	}

	private static void anonymousRectangleTest() {
		
		int Area = new Rectangle().calcArea();
		System.out.println("Area of Anonymous Rectangle is "+Area);
		
	}

	private static void rectangleAssignmentTest() {
		
		Rectangle rect1 = new Rectangle();
		 rect1.setHeight(50);
		 rect1.setWidth(5);
		 
		 Rectangle rect2 = rect1;
		  rect2.setWidth(6);
		  System.out.println("Area of Rectangle 1:"+rect1.calcArea());
		  System.out.println("Area of Rectangle 2:"+rect2.calcArea());
		
	}

	private static void shouldCalcPerimeterTest() {
		
		Rectangle rect;
		rect = new Rectangle();
		int expectedPerimeter = 20;
		
		rect.setHeight(10);
		rect.setWidth(30);
		
		int actualPerimeter = rect.calcPerimeter();
		
		if(actualPerimeter==expectedPerimeter)
			System.out.println("shouldCalcPerimeter Test passed");
		else
			System.out.println("shouldCalcPerimeter Test failed");
		
		
	}

	private static void shouldCalcAreaTest() {
		
		Rectangle rect;
		rect = new Rectangle();
		int expectedArea = 400;
		
		rect.setHeight(10);
		rect.setWidth(30);
		
		int actualArea = rect.calcArea();
		
		if(actualArea==expectedArea)
			System.out.println("shouldCalcArea Test passed");
		else
			System.out.println("shouldCalcArea Test failed");
		
		
	}
		
	

	private static void shouldSetHeightTest() {
				
		//Arrange
		Rectangle rect;
		rect = new Rectangle();
		int expectedHeight = 10;
				
		//Act
		rect.setHeight(10);
		int actualHeight = rect.getHeight();
			
		//Assert
		if(expectedHeight==actualHeight)
		System.out.println("shouldSetHeight Test passed");
			
		else System.out.println("shouldSetHeight Test Failed");
	}

	private static void shouldSetWidthTest() {
		
		//Arrange
		Rectangle rect;
		rect = new Rectangle();
		int expectedWidth = 0;
				
		//Act
		rect.setWidth(-1);
		int actualWidth = rect.getWidth();
				
		//Assert
		if(expectedWidth==actualWidth)
			System.out.println("shouldSetWidthTest passed");
				
		else System.out.println("shouldSetWidthTest Failed");
		
	}

	private static void shouldFillColorTest() {
		
		//Arrange
		Rectangle rect; //expecting to be object Rectangle
		rect = new Rectangle(); //assgining object
		String expectedColor = "Red";
		
		//Act
		rect.fillColor("XYZ");
		String actualColor =rect.getColor();

		//Assert
		if(actualColor.equalsIgnoreCase(expectedColor))
			System.out.println("shouldFillColorTest Passed");
		else 
			System.out.println("shouldFillColorTest Failed");

		
	}

}
