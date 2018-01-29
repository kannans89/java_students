package com.create.object.deserlization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.create.object.deserlization.Student;

public class DesiralaztionTest {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		// create a object
		Student s = new Student("sandeep", 12);
		System.out.println(s.hashCode());
		// Serialize the student object s//
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("data.ser"));
		out.writeObject(s);
		out.flush();
		out.close();

		ObjectInputStream in = new ObjectInputStream(new FileInputStream("data.ser"));

		Student student;
		try {
			student = (Student) in.readObject();
			System.out.println(student.hashCode());
			System.out.println(student.getName() + " " + student.getRollNo());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		in.close();

	}
}
