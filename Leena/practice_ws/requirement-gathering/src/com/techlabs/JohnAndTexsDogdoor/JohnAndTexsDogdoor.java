package com.techlabs.JohnAndTexsDogdoor;

public class JohnAndTexsDogdoor {
	
	private boolean open;
	
	public JohnAndTexsDogdoor(){
		this.open=false;
	}
	
	public void open(){
		System.out.println("The dog door opens");
		open=true;
	}
	
	public void close(){
		System.out.println("The dog door closes Automatically");
		open=false;
	}
	public boolean isOpen(){
		return open;
	}
	


}
