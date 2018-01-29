package com.techlabs.facadepatterntest;

import com.techlabs.facadepattern.ShapeMaker;

public class FacadePatternTest {
	public static void main(String[] args) {
		ShapeMaker shapeMaker = new ShapeMaker();

		shapeMaker.drawCircle();
		shapeMaker.drawRectangle();
		shapeMaker.drawSquare();
	}
}