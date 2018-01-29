package com.techlabs.polymorphism;

public class Boy implements IEmotionable, IMannerable{

	public void cry() {
		System.out.println("boy is crying");
	}

	public void laugh() {
		System.out.println("boy is laughing");
	}

	public void wish() {
		System.out.println("boy  is wishing");
		
	}

	public void depart() {
		System.out.println("boy is departing");
	}
	
	
	public void eat(){
		System.out.println("boy is eating");
	}
	
	
	

}
