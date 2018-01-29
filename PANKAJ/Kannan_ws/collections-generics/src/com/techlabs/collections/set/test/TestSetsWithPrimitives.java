package com.techlabs.collections.set.test;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TestSetsWithPrimitives {

	public static void main(String[] args) {

		Set<Integer> myDeptNo = new HashSet<Integer>();
		Scanner sc = new Scanner(System.in);

		for (int i = 1; i <= 5; i++) {
			System.out.println("Enter a deptNo :");
			int deptno = sc.nextInt();
			myDeptNo.add(deptno);
		}
		sc.close();

		System.out.println("Printing distinct deptNo:");
		for (Integer x : myDeptNo) {
			System.out.println("Dept No is " + x);
		}

	}

}
