package com.techlabs.HollyAndBrucesDogdoor;

public class HollyAndBrucesDogDoor {
	private boolean open;
	
	public HollyAndBrucesDogDoor() {
		this.open=false;
	}
	
	public boolean open(){
		System.out.println("Dog door opens");
		return open=true;
	}
	public boolean close(){
		System.out.println("Dog door closes Automatically");
		return open=false;
	}
	
	public boolean isOpen(){
		return open;
	}
	
}
