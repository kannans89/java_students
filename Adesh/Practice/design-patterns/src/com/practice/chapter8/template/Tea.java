package com.practice.chapter8.template;

import java.io.IOException;
import java.util.Scanner;

public class Tea extends CaffeineBeverages{

	@Override
	public void addCondiments() {
		System.out.println("Adding Lemon");
	}

	@Override
	public void brew() {
		System.out.println("Steeping the Tea");
	}

	@Override
	public boolean customerWantsCondiments() {
		String answer = null;
		try {
			answer = getUserInput();
		} catch (IOException e) {
			System.out.println("IO error trying to read your answer");
		}
		
		if(answer.toLowerCase().startsWith("y")){
			return true;
		}else {
			return false;
		}
	}

	private String getUserInput() throws IOException {
		String answer = null;
		
		System.out.println("Would you like to add lemon with your Tea..  (y/n)? ");
		
		Scanner in = new Scanner(System.in);
		answer =in.nextLine();
		if(answer == null){
			answer = "no";
		}
		return answer;
	}
	
}
