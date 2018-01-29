package com.techlabs.autowiring.test;

import com.techlabs.autowiring.Triangle;
import com.techlabs.autowiring.TriangleFactory;

public class Test {

	public static void main(String[] args) {
		Triangle triangle=TriangleFactory.getTriangle();
		triangle.draw();
	}

}
