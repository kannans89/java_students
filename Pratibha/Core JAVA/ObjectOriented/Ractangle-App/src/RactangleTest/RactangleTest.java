package RactangleTest;

import Ractangle.*;

public class RactangleTest {
	public static void main(String args[]) {
		Ractangle small = new Ractangle();

		small.setWidth(5);
		small.setheight(10);

		Ractangle big = new Ractangle();

		big.setWidth(50);
		big.setheight(-20);

		printInfo(small);
		printInfo(big);
	}

	private static void printInfo(Ractangle small) {
		System.out.println();
		System.out.println("Height=" + small.getWidth());
		System.out.println("Width=" + small.getheight());
		System.out.println("Area=" + small.calculateArea());

	}

}
