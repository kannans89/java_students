package com.techlabs.polymorphism;

public class Boy implements IMannerable,IEmotionable {
	
	@Override
	public void wish(){
		System.out.println("Boy is wishing");
	}
	
	@Override
	public void depart(){
		System.out.println("Boy is saying Bye-Bye..");
	}

	@Override
	public void cry(){
		System.out.println("Boy is crying");
	}

	@Override
	public void laugh(){
		System.out.println("Boy is laughing");
	}
	
	public void eat(){
		System.out.println("Boy Is Eating");
	}

}
