package com.prctice.day1;

public class Welcome {

	public static void main(String[] args) {

			if (args.length < 5) {
				System.out.println("Welcome..!!!!");
				for(String arg:args){
					System.out.println(arg);
				}
				
			}

			else
				System.out.println("oops...length of args[] is exceeding 5");
		
		System.out.println("Length of args[] is:"+args.length);
	}

}
