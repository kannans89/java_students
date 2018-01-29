package com.techlabs.studentdml.test;

import java.util.Scanner;

import com.techlabs.student.dml.DmlOperations;

public class StudentDmlTest {
private static Scanner sc;
	public static void main(String[] args) throws Exception {
		DmlOperations dml =new DmlOperations();
		sc=new Scanner(System.in);
		int id,rollNo;
		String name;
		dml.ShowRecords();
		System.out.println("Insert Record : Id  rollNo  Name");
		id=sc.nextInt();
		rollNo=sc.nextInt();
		name=sc.nextLine();
		dml.insertRecord(id,rollNo, name);
		dml.ShowRecords();
		
		System.out.println("Delete Record : Id");
		id=sc.nextInt();
		dml.deleteRecord(id);
		dml.ShowRecords();
		
		System.out.println("Update Record : Id RollNo Name");
		id=sc.nextInt();
		rollNo=sc.nextInt();
		name=sc.nextLine();
		dml.updateRecord(id,rollNo, name);
		dml.ShowRecords();
	}

}
