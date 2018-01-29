package com.techlabs.interfaces;

public class Boy implements IManners, IEmotions {

	@Override
	public void cry() {
		System.out.println("Boy cries");

	}

	@Override
	public void laugh() {
		System.out.println("Boy laughs");
	}

	@Override
	public void wish() {
		System.out.println("Boy says hello");

	}

	@Override
	public void depart() {
		System.out.println("Boy says bye");

	}

}
