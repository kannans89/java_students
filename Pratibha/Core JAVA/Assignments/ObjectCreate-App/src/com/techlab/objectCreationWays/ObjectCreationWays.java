package com.techlab.objectCreationWays;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;

@SuppressWarnings("serial")
public class ObjectCreationWays implements Cloneable, Serializable {
	public static void main(String args[]) throws Exception {

		Employee emp1 = new Employee();

		System.out.println(emp1.getName());

		Employee emp2 = (Employee) Class.forName(
				"com.techlab.objectCreationWays.Employee").newInstance();
		System.out.println(emp2.getName());
		

		Employee emp3 = Employee.class.newInstance();
		System.out.println(emp3.getName());

		Constructor<Employee> constructor = Employee.class.getConstructor();
		Employee emp4 = constructor.newInstance();
		System.out.println(emp4.getName());

		ObjectOutputStream out =new  ObjectOutputStream(new FileOutputStream(
				"data.obj"));
		out.writeObject(emp4);
		out.close();
		
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("data.obj"));
		Employee emp61= (Employee) in.readObject();
		in.close();
		System.out.println(emp61.getName());
		Employee emp5 = (Employee) emp1.clone();
		System.out.println(emp5.getName());



	}

}
