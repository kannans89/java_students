package com.techlabs.collection.crud;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class TestLinkedHashSet {

	public static void main(String[] args) {

		Set<String> branch = new LinkedHashSet<String>();
		createSet(branch);
		//readSet(branch);
		//delete(branch);
		 displaySet(branch);
		//updateSet(branch);
	}

	private static void createSet(Set<String> currentset) {
		Scanner scr = new Scanner(System.in);
		System.out.println("How much branches do u have??");
		int total = scr.nextInt();
		System.out.println("Enter branches  ");
		for (int index = 1; index <= total; index++) {
			currentset.add(scr.next());
		}
		System.out.println(" New Set is Created ");

	}

	private static void readSet(Set<String> currentSet) {
		if (currentSet.isEmpty()) {
			System.out
					.println("No set is available ....You have to create new set");
			createSet(currentSet);
			System.out.println("Reading Elements of Set :");
			displaySet(currentSet);
		} else {
			System.out.println("Reading Elements of Set :");
			displaySet(currentSet);
		}

	}

	private static void delete(Set<String> currentSet) {
		System.out.println("This is deleting Operation :");
		Scanner scr = new Scanner(System.in);
		System.out.println("Which element u want to delete??");
		String element = scr.next();
		currentSet.remove(element);
		System.out.println(element + " Branch is deleted from the Currentset ");
		System.out.println("After delete Operation : ");
		displaySet(currentSet);
	}

	private static void updateSet(Set<String> currentSet) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Which Branch you want to update");
		String key = scr.next();

		boolean isIn = currentSet.contains(key);

		if (isIn == true) {
			System.out.println(key + " is already present in the Current Set");
			System.out
					.println("Do u want to replace it?? Press Yes(1) or No(0)");
			int ans = scr.nextInt();
			if (ans == 1) {
				System.out
						.println("Enter Branch which u want to add instead of "
								+ key);
				String newBranch = scr.next();
				currentSet.add(newBranch);
				System.out.println("HashSet is Successfully updated");
				displaySet(currentSet);
			} else {
				System.out.println(" No updation done");
				displaySet(currentSet);
			}
		} else {
			System.out.println(key + " is not present in the Current Map");
			System.out.println("Do u want to add it?? Press Yes(1) or No(0)");
			int ans = scr.nextInt();
			if (ans == 1) {
				System.out.println("Enter element u want to add..");
				String newBranch = scr.next();
				currentSet.add(newBranch);
				System.out.println("HashSet is Successfully updated");
				displaySet(currentSet);
			}
		}
	}

	private static void displaySet(Set<String> branch) {
		for (String temp : branch) {
			System.out.print(temp + " ,"+"");
		}
	}

}
