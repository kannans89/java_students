package com.techlabs.kristenAndbitslesDogDoor;

public class KristensAndBristlesDogDoor {
	
	private boolean open;
	
  public KristensAndBristlesDogDoor() {

		this.open=true;
	}
	
	public void open(){
		System.out.println("The dog door opens");
		open=true;
	}
	
	public void close(){
		System.out.println("The Dogdoor and All windows are lock.....");
		open=false;
	}
	public boolean isOpen(){
		return open;
	}
	

}
