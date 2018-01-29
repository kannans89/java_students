package com.prctice.day1;

class DrumKit{
	boolean topHat=true;
	boolean snare=true;
	
	void playTopHadt(){
		System.out.println("Ding ding da-ding");
	}
	
	void playSnare(){
		System.out.println("bang bang ba-bang");
	}
}

public class DrumKitTestDrive {

	public static void main(String[] args) {
		DrumKit drumobject= new DrumKit();
		drumobject.playSnare();
		drumobject.snare=false;
		drumobject.playTopHadt();
		
		if(drumobject.snare==true){
			drumobject.playSnare();
		}
		
	}

}
