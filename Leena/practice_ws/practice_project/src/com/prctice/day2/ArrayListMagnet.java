package com.prctice.day2;
import java.util.*;

public class ArrayListMagnet {

	public static void main(String[] args) {
		ArrayList<String> a=new ArrayList<String>();
		a.add(0,"zero");
		a.add(1,"one");
		a.add(2,"Two");
		a.add(3,"Three");
		printAl(a);
		
		if(a.contains("Three")){
			a.add("Four");
		}
		a.remove(2);
		printAl(a);
		
		if(a.indexOf("Four")!=4){
			a.add(4,"4.22");
			printAl(a);		}
		
		//System.out.println(a.indexOf("4.22"));
		//System.out.println(a.get(2));
	}
	
	public static void printAl(ArrayList<String> a1){
		
		for(String element:a1){
			System.out.print(element+" ");
		}
		System.out.println(" ");
		
	}
}
