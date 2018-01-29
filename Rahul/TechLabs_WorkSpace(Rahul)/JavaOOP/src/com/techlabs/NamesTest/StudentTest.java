package com.techlabs.NamesTest;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import com.techlabs.Student.Student;

public class StudentTest {

	public static void main(String[] args) {
		//Student student = new Student();

		Set<Student> hashSet = new HashSet<Student>(); // shows random output
		Set<Student> linkedHashSet = new LinkedHashSet<Student>(); // shows output in order of insertion
		// Set<Student> treeSet = new TreeSet<Student>(); // shows output in sorted way

		try {
			BufferedReader reader = new BufferedReader(new FileReader(new File("c:\\Student.txt")));
			String line = null;
			while ((line = reader.readLine()) != null) {

				String token[] = line.split(",");
				int id = Integer.parseInt(token[0]);
				String name = token[1];
				float grade = Float.parseFloat(token[2]);
				Student student = new Student();
				student.setId(id);
				student.setName(name);
				student.setGrade(grade);

				hashSet.add(student);
				linkedHashSet.add(student);
			}

			System.out.println("--------");
			System.out.println("Hast set" + hashSet);
			System.out.println("--------");
			System.out.println("Linked Hash Set output : " + linkedHashSet);
			// System.out.println("Tree Set output : " + treeSet);*/
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
