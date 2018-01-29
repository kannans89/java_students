package com.practice.chapter8.template;

import java.io.IOException;
import java.util.Scanner;

public class Coffee extends CaffeineBeverages{

	@Override
	public void addCondiments() {
		System.out.println("Adding Sugar and Milk");
	}

	@Override
	public void brew() {
		System.out.println("Dripping coffee through filter");
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
		}else{
			return false;
		}
	}
	
	private String getUserInput() throws IOException{
		String answer = null;
		
		System.out.println("Would you like milk and sugar with your coffee (y/n)? ");
		
		Scanner in = new Scanner(System.in);
		answer = in.nextLine();
		if(answer == null){
			return "no";
		}
		return answer;
	}
}
