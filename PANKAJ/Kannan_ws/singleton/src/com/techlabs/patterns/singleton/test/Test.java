package com.techlabs.patterns.singleton.test;

import com.techlabs.patterns.singleton.ChocolateBoiler;

public class Test {

	public static void main(String[] args) {

		ChocolateBoiler chocolateBoiler=ChocolateBoiler.getInstance();
		chocolateBoiler.fill();
		chocolateBoiler.boil();
		chocolateBoiler.drain();
	}

}
