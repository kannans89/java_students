package com.techlabs.testStudentMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

import com.techlabs.Map.Student;

public class TestStudentMap {

	public static void main(String[] args) {
		Student s1 = new Student(101, 10, "A");
		Student s2 = new Student(101, 10, "B");
		Student s3 = new Student(102, 9, "A");
		// Map<Student, Student> map = new HashMap<Student, Student>();
		Map<Student, Student> map = new TreeMap<Student, Student>();

		map.put(s1, s1);
		map.put(s2, s2);
		map.put(s3, s3);
		System.out.println(map.size());
	}

}
