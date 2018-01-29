package com.techlabs.custom.exception.test;

import com.techlabs.shape.Rectangle;

public class Test {

	public static void main(String[] args) {

		try {
			Rectangle r = new Rectangle(100, -200);
			System.out.println("Area is: " + r.getArea());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
