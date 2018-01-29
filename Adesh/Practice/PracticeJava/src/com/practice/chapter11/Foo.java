package com.practice.chapter11;

public class Foo {

	public static void main(String[] args) {
		go();
	}

	public static void go() {
		Laundry laundry = new Laundry();
		try {
			laundry.doLaundry();
		} catch (PantsException pex) {
			System.out.println("in the pants exception");
		} catch (LingerieException lex) {
			System.out.println("in the lingerie exception");
		} catch (ClothingException cex) {
			System.out.println("in the clothing exception");
		}
	}

}
