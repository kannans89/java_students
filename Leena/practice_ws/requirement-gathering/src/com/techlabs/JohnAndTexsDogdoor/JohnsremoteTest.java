package com.techlabs.JohnAndTexsDogdoor;

public class JohnsremoteTest {

	public static void main(String[] args) {
		
		JohnAndTexsDogdoor door=new JohnAndTexsDogdoor();
		JohnsRemote remote= new JohnsRemote(door);
		
		door.open();
		System.out.println("tex goes Outside");
		door.close();
		System.out.println("Tex does his buisness..but he gets muddy");
		System.out.println("John's cleans Tex up");
		System.out.println("John Pressing the remote control Button....");
		remote.pressButton();
	    System.out.println("tex comes back inside");
		
	}

}
