package com.practice.chapter1;

public class Exercise1b {

	public static void main(String[] args) {
		int x=1;
		int z=5;
		
		while(x<10){
			if(x>3){
				System.out.println("big x");
			}
			x=x+1;
		}
		
		while(z>1){
			z=z-1;
			if(z<3){
				System.out.println("small z");
			}
		}

	}

}
