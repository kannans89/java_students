package com.prctice.day2;

public class testGuitar {

	public static void main(String[] args) {
		
	/*	ElectricGuitar[] myGuitar;
		myGuitar=new ElectricGuitar[3];
		
		myGuitar[0] = new ElectricGuitar("RainSong",500,"Yes");
		myGuitar[1]= new ElectricGuitar("Parker", 1000,"No");
		myGuitar[2]=new ElectricGuitar("Hondo", 150,"Yes");
		
		for(ElectricGuitar temp:myGuitar){
			
			displayDetails(temp);
		} */
		
		testing();
		
	}
	
	public static void displayDetails(ElectricGuitar guitar){
		System.out.println("Brand of Guitar Is :"+guitar.getBrand());
		System.out.println("Pickups of Guitar Is :"+guitar.getNumOfpickups());
		System.out.println("RockStar Use It?? :"+guitar.getrockStarUsesIt());
		System.out.println("============================================================================");
	}
	
 
	
	public static void testing(){
		ElectricGuitar	guitar1=new ElectricGuitar("New Parker",500,"Yes");
		System.out.println("Before Changes :");
		displayDetails(guitar1);
		changeValues(guitar1);
		System.out.println("After Changes :");
		displayDetails(guitar1);
	}
	 
	public static void changeValues(ElectricGuitar guitar1){
		System.out.println("IN Function :");
		guitar1.setrockStarUsesIt("no");
		displayDetails(guitar1);
	}
}
