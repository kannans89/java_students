package com.techlabs.student;

import java.util.List;

public class Student {
	String name;

	public void putEntry(List<Student> students) {

		Student studentObject = new Student();
		studentObject.setName("Pankaj");
		students.add(studentObject);
	}

	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	

}
