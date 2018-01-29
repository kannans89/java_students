package com.techlabs.numbers;
import java.util.*;
public class NumberSeries {
	
	ArrayList<Integer> evenNumbersList = new ArrayList<Integer>();
	ArrayList<Integer> oddNumbersList = new ArrayList<Integer>();

	public void checkNumber(int number){
		if((number%2)==0){
			evenNumbersList.add(number);
		}
		else{
			oddNumbersList.add(number);
		}
		
	}

	public ArrayList<Integer> getevenNumbersList() {
		return evenNumbersList;
	}
	
	public ArrayList<Integer> getoddNumbersList() {
		return oddNumbersList;
	}

	

	}
