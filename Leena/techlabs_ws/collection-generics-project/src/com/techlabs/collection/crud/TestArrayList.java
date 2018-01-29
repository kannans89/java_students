package com.techlabs.collection.crud;
import java.util.*;

public class TestArrayList {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		create(list);
		//update(list);
		//deleteOperation(list);
		//readOperation(list);
		displayList(list);

	}

	public static void create(ArrayList<Integer> list) {
		Scanner scr=new Scanner(System.in);
		System.out.println("How many elements do u want to add??");
		int total=scr.nextInt();
		System.out.println("enter elements of list :");
		for(int index=0;index<total;index++){
			list.add(scr.nextInt());
		}
	}

	public static void readOperation(ArrayList<Integer> list){
		System.out.println("Reading data from List : ");
		displayList(list);
	}
	
	public static void update(ArrayList<Integer> list) {
		//replaceOperation(list);
		//addOperation(list);
		
		Scanner scr = new Scanner(System.in);
		System.out.println("Which element you want to replace");
		int element = scr.nextInt();

		boolean isIn = list.contains(element);
		if (isIn == true) {
			int idx = list.indexOf(element);
			System.out.println(list.get(idx) + " is already present on index "+ list.indexOf(element));
			
			System.out.println("Do u want to update it?? Press Yes(1) or No(0)");

			int ans = scr.nextInt();
			if (ans == 1) {
				System.out.println("Enter no. which u want to add");
				int no = scr.nextInt();
				list.set(list.indexOf(element), no);
				System.out.println("List is Successfully updated");
				displayList(list);
			} else {
				System.out.println(" No updation done");
				displayList(list);
			}
		}
		else{
			addOperation(list);
		}
	}
	
	public static void addOperation(ArrayList<Integer> list){
		Scanner scr = new Scanner(System.in);
	
		System.out.println("Which element you want to replace");
		int element = scr.nextInt();

		boolean isIn = list.contains(element);
		if (isIn == false) {
			System.out.println(element+ " is not present in current list");
			System.out.println("Do u want to add it to list?? Press Yes(1) or No(0)");
			int ans = scr.nextInt();
		if (ans == 1) {
			list.add(element);
			System.out.println("Element is added Successfully...");
			displayList(list);
		} else {
			System.out.println(" No updation done");
			displayList(list);
		}

  }
	}
	
	public static void deleteOperation(ArrayList<Integer> list){
		System.out.println("This is deleting Operation :");
		Scanner scr=new Scanner(System.in);
		System.out.println("Which index u want to delete??");
			int delindex=scr.nextInt();
			list.remove(delindex);
			System.out.println("Element stored at "+delindex +" inedx is deleted");
	}
	
	public static void displayList(ArrayList<Integer> list) {
		for(Integer item:list){
			int i=list.indexOf(item);
			System.out.println(list.get(i)+" stored at :" +i);
			
		}
		//System.out.println(list);
	}
	/*public static void replaceOperation(ArrayList<Integer> list){
	Scanner scr = new Scanner(System.in);
	System.out.println("Which element you want to replace");
	int element = scr.nextInt();

	boolean isIn = list.contains(element);
	if (isIn == true) {
		int idx = list.indexOf(element);
		System.out.println(list.get(idx) + " is already present on index "+ list.indexOf(element));
		
		System.out.println("Do u want to update it?? Press Yes(1) or No(0)");

		int ans = scr.nextInt();
		if (ans == 1) {
			System.out.println("Enter no. which u want to add");
			int no = scr.nextInt();
			list.set(list.indexOf(element), no);
			System.out.println("List is Successfully updated");
			displayList(list);
		} else {
			System.out.println(" No updation done");
			displayList(list);
		}
	}
	else{
		addOperation(list);
	}
}

*/
}