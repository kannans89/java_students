package com.prctice.day1;

public class RepeatedWords {
	public static void main(String args[]){
		System.out.println("Expected String is: DooBeeDooBeeDo");
		int word=1;
		System.out.print("Reulted String is : ");
		while(word<3){
			System.out.print("Doo");
			System.out.print("Bee");
			word=word+1;
		}
		if(word==3)
			System.out.print("Do");
	}

}
