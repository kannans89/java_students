package com.practice.chapter3;

public class Hobbits {
	String name;

	public static void main(String[] args) {
		
		Hobbits[] h=new Hobbits[3];
		int z=0;
		
		while(z<3){
			
			h[z]=new Hobbits();
			h[z].name="buzo";
			if(z==1){
				h[z].name="froyo";
			}
			if(z==2){
				h[z].name="bilbo";
			}
			System.out.print(h[z].name+" is a ");
			System.out.println("good hobbit name");
			z=z+1;
		}
	}
}
