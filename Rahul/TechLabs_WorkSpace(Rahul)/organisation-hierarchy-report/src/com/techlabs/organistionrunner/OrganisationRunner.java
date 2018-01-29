package com.techlabs.organistionrunner;

import java.util.Scanner;

import com.techlabs.employee.Employee;
import com.techlabs.inputsource.FileDatabase;
import com.techlabs.inputsource.IInputSource;
import com.techlabs.organisation.Organisation;

public class OrganisationRunner {

	// Methods

	public void run() {
		Employee ceo = new Employee(1, "Mr.Rahul Tawade", 0);

		Employee programManager1 = new Employee(101, "Mr. Mayuresh", 1);
		Employee programManager2 = new Employee(102, "Mr. Vijay", 1);
		Employee programManager3 = new Employee(103, "Mr. Siddhesh", 1);

		Employee projectManager1 = new Employee(201, "Mr. Ram", 101);
		Employee projectManager2 = new Employee(202, "Mr.Shyam", 101);

		Employee projectManager3 = new Employee(203, "Mr.Arjun", 102);

		Employee swTester1 = new Employee(308, "Miss. Sita", 103);
		Employee swTester2 = new Employee(309, "Miss. Gita", 103);

		Employee swDeveloper1 = new Employee(301, "Mr.Akshay", 201);
		Employee swDeveloper2 = new Employee(302, "Mr.Pramod", 201);
		Employee swTester3 = new Employee(303, "miss.Prachi", 201);

		Employee jrSwDeveloper1 = new Employee(501, "Mr.Parth", 301);

		Employee swDeveloper3 = new Employee(304, "Mr.Abishekh", 202);
		Employee swTester4 = new Employee(305, "mrs.Sheetal", 202);

		Employee swDeveloper4 = new Employee(305, "Mr.Rakesh", 203);
		Employee jrSwDeveloper2 = new Employee(502, "Miss.Komal", 305);

		ceo.addReportee(programManager1);
		ceo.addReportee(programManager2);
		ceo.addReportee(programManager3);

		programManager1.addReportee(projectManager1);
		programManager1.addReportee(projectManager2);
		programManager2.addReportee(projectManager3);
		programManager3.addReportee(swTester1);
		programManager3.addReportee(swTester2);

		projectManager1.addReportee(swDeveloper1);
		projectManager1.addReportee(swDeveloper2);
		projectManager1.addReportee(swTester3);
		swDeveloper1.addReportee(jrSwDeveloper1);

		projectManager2.addReportee(swDeveloper3);
		projectManager2.addReportee(swTester4);

		projectManager3.addReportee(swDeveloper4);
		swDeveloper4.addReportee(jrSwDeveloper2);

		IInputSource inputSource = new FileDatabase();

		Organisation organisation = Organisation.getOrganisation(ceo,
				inputSource);
		organisation.setEmployeeMap();

		organisation = Organisation.getOrganisation(programManager1,
				inputSource);
		organisation.setEmployeeMap();

		organisation = Organisation.getOrganisation(programManager2,
				inputSource);
		organisation.setEmployeeMap();

		organisation = Organisation.getOrganisation(programManager3,
				inputSource);
		organisation.setEmployeeMap();

		organisation = Organisation.getOrganisation(projectManager1,
				inputSource);
		organisation.setEmployeeMap();

		organisation = Organisation.getOrganisation(projectManager2,
				inputSource);
		organisation.setEmployeeMap();

		organisation = Organisation.getOrganisation(projectManager3,
				inputSource);
		organisation.setEmployeeMap();

		organisation = Organisation.getOrganisation(swDeveloper1, inputSource);
		organisation.setEmployeeMap();

		organisation = Organisation.getOrganisation(swDeveloper2, inputSource);
		organisation.setEmployeeMap();

		organisation = Organisation.getOrganisation(swDeveloper3, inputSource);
		organisation.setEmployeeMap();

		organisation = Organisation.getOrganisation(swDeveloper4, inputSource);
		organisation.setEmployeeMap();

		organisation = Organisation.getOrganisation(swTester1, inputSource);
		organisation.setEmployeeMap();

		organisation = Organisation.getOrganisation(swTester2, inputSource);
		organisation.setEmployeeMap();

		organisation = Organisation.getOrganisation(swTester3, inputSource);
		organisation.setEmployeeMap();

		organisation = Organisation.getOrganisation(swTester4, inputSource);
		organisation.setEmployeeMap();

		organisation = Organisation
				.getOrganisation(jrSwDeveloper1, inputSource);
		organisation.setEmployeeMap();

		organisation = Organisation
				.getOrganisation(jrSwDeveloper2, inputSource);
		organisation.setEmployeeMap();

		(organisation.getInputSource()).selectSource();

		System.out.println("The Hierarchy for the Organaization is -->");
		ceo.printReportees();

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Employee ID to Search : ");
		int inputFromUser = scan.nextInt();
		String employeeName = organisation.getEmployeeName(inputFromUser);
		System.out.println("Employee name with ID (" + inputFromUser
				+ ") is :- " + employeeName);
		scan.close();

	}

}
