package com.techlabs.decorator.test;

import com.techlabs.decorator.Circle;
import com.techlabs.decorator.ColorDecorator;
import com.techlabs.decorator.IShape;
import com.techlabs.decorator.TransparencyDecorator;

public class TestMain {

	public static void main(String[] args) {
		IShape shape = new TransparencyDecorator(new ColorDecorator(
				new Circle(), "Red"), 200);
		shape.draw();
	}

}
