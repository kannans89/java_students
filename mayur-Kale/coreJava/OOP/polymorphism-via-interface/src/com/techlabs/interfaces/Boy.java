package com.techlabs.interfaces;

public class Boy implements IMannerable, IEmotionable {

	@Override
	public void cry() {
		System.out.println("Boy is crying");
	}

	@Override
	public void laughs() {
		System.out.println("Boy is laughing");
	}

	@Override
	public void wish() {
		System.out.println("Boy wishes");
	}

	@Override
	public void depart() {
		System.out.println("Boy departs");
	}

	public void play() {
		System.out.println("Boy plays");
	}

}
