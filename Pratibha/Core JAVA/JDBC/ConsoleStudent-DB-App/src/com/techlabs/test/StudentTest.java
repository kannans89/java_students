package com.techlabs.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.techlabs.model.Student;
import com.techlabs.service.StudentService;

public class StudentTest {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		StudentService studentservise=new StudentService();
		StudentVeiw studentveiw=new StudentVeiw();
		Student stud=new Student();
		int choise = 0;
		while (choise != 5) {
			System.out
					.println("Enter your choise:\n1) Show Student."
							+ "\n2)Delete Student. 3)Add Student.\n4)Edit Student\n5)Exit");
			choise = sc.nextInt();
		
		switch(choise){
		case 1:studentveiw.getRecords();
		break;
		case 2:System.out.println("Enter rollno to delete student");
		int id=sc.nextInt();
			studentservise.deleteStudent(id);
			break;
		case 3:System.out.println("Enter name");
		String name=sc.next();
		stud.setName(name);
		System.out.println("Enter Address");
		String address=sc.next();
		stud.setAddress(address);
		System.out.println("Enter Email");
		String email=sc.next();
		stud.setEmail(email);
		System.out.println("Enter Contact");
		String contact=sc.next();
		stud.setContact(contact);
		System.out.println("Enter Gender Type(Male/Female)");
		String gender=sc.next();
		stud.setGender(gender);
		studentservise.addStudent(stud);
		break;
		case 4:System.out.println("Enter rollno");
		stud.setId(sc.nextInt());
		System.out.println("Enter name");
		stud.setName(sc.next());
		System.out.println("Enter Address");
		stud.setAddress(sc.next());
		System.out.println("Enter Email");
		stud.setEmail(sc.next());
		System.out.println("Enter Contact");
		stud.setContact(sc.next());
		System.out.println("Enter Gender Type(Male/Female)");
		stud.setGender(sc.next());
		studentservise.editStudent(stud);
		break;
		case 5:System.exit(0);
		break;
		}
	}
}
}