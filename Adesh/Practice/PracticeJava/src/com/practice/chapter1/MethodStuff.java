package com.practice.chapter1;

public class MethodStuff {
	public static void print(String text){
		System.out.println(text);
	}

	public static void main(String[] args) {
		//1. Statements & Declarations
		int x=3;
		String name="adesh";
		x=x*17;
		print("value of x is "+x+" name is "+name);
		
		//2. Looping
		while(x>12){
			x=x-1;
		}
		print("value of x is "+x);
		
		for(int i=1;i<=10;i=i+1){
			print("now value of i after decrementing "+i+" times "+i);
		}
		
		int []i={45,67,7,9};
		for(int k:i){
			print(""+k);
		}
		
		//3. Branching
		if(x == 10){
			print("x must b 10");
		}
		else{
			print("x isn't 10");
		}
		
		if((x>3) & (x<34)){
			print("x is between 3 & 34");
		}
		print("this line has to run");
		
		//While Loop
		int z=1;
		print("Before the Loop");
		while(z<4){
			print("in the loop");
			print("value of the z is "+z);
			z = z+1;
		}
		print("This is after the loop");
		}
}
