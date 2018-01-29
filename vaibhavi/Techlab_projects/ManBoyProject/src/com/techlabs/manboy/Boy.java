package com.techlabs.manboy;

public class Boy extends Man {

	public void wish()
	{
		System.out.println("Boy is wishing everyone HELLO");
	}
	
	@Override
	public void play()
	{
		System.out.println("Boy is playing football");
	}
}
