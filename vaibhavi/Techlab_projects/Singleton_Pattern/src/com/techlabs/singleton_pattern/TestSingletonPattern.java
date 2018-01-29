package com.techlabs.singleton_pattern;

public class TestSingletonPattern {

	public static void main(String[] args) {

		ChocolateBoiler instance=ChocolateBoiler.getInstance();
		instance.fill();
		instance.boil();
		instance.fill();
		instance.boil();
		instance.empty();
		instance.fill();
		ChocolateBoiler instance1=ChocolateBoiler.getInstance();
		instance1.fill();
		instance.empty();
		instance1.fill();
		
	}

}
