package com.techlab.employeeTest;

import com.techlab.employee.*;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee[] e=new Employee[3];
		e[0]=new Manager(1,"Pratibha",10000);
		e[1]=new Developer(2,"Shweta",15000);
		e[2]=new Tester(3,"Akshay",30000);
		printInfo(e);
	}

	private static void printInfo(Employee[] e) {
		for(Employee i:e){
		System.out.println("ID:"+i.getId()+"\nName:"+i.getName()
				+"\nBasic Salary:"+i.getBasicSalary()
				+"\nNet Salary:"+i.calculateNetSalary(i.getBasicSalary()));
		System.out.println();
		}
	}

}
