package com.techlabs.details.test;

import com.techlabs.departments.Branch;
import com.techlabs.employee.details.Person;
import com.techlabs.employee.details.Professor;
import com.techlabs.employee.details.Student;

public class Test {

	public static void main(String[] args) {
		testStudent();
		testProfessor();
	}
	
	public static void testStudent(){
		System.out.println("Student Details : ");
		Person[] newStudent=new Person[2];
		newStudent[0]=new Student(01,"Seawoods","20 Jan 1994",Branch.EXTC);
		newStudent[1]=new Student(02,"Dadar","21 Feb 1994",Branch.CIVIl);
		printDetails(newStudent);
	}
	
	public static void testProfessor(){
		System.out.println("Professor Details : ");
		Person[] newProfessor=new Person[2];
		newProfessor[0]=new Professor(100,"Kharghar","30 December 1985","Leena",10000);
		newProfessor[1]=new Professor(200,"C.S.T","06 October 1985","rahul",20000);
		printDetails(newProfessor);
	}
	
	
	/*public static void testStudent(){
		Student studentObj1=new Student(01,"Seawoods","20 Jan 1994",Branch.EXTC);
		Student studentObj2=new Student(02,"Dadar","21 Feb 1994",Branch.CIVIl);
		printDetails(studentObj1);
		printDetails(studentObj2);
		
	}
	
	public static void testProfessor(){
		Professor professorObj1=new Professor(100,"Kharghar","30 December 1985","Leena",10000);
		Professor professorObj2=new Professor(200,"C.S.T","06 October 1985","rahul",20000);
		printDetails(professorObj1);
		printDetails(professorObj2);
		
	}*/

	/*public static void printDetails(Student obj){
		System.out.println("ID is :"+obj.getID());
		System.out.println("Your address is :"+obj.getAddress());
		System.out.println("Your BirthDate is :"+obj.getDOB());
		System.out.println("Your Branch is : "+obj.getBranch());
	}
	*/
	/*public static void printDetails(Professor obj){
		System.out.println("Hii.."+obj.getName()+"Your ID is :"+obj.getID());
		System.out.println("Your address is :"+obj.getAddress());
		System.out.println("Your BirthDate is :"+obj.getDOB());
		System.out.println("Your salary is :"+obj.getSalary());
	}*/
	
	public static void printDetails(Person obj){
		System.out.println(obj);
	}
	
	public static void printDetails(Person[] obj){
		for(Person display:obj){
		System.out.println(display);
		System.out.println("=======================================================================================================");
		}
	}

	

}
