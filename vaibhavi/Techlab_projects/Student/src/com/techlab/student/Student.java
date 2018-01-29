package com.techlab.student;

import java.util.List;


public class Student {

	private String name;
	
	public void setName(String n)

	{
		name=n;
	}
	public String getName()
	{
		return name;
	}
	
	public void putEntry(List<Student> students )
	{
		Student s=new Student();
		s.setName("Vaibhavi");
		 students.add(s);
		 
	}
	@Override
	public String toString() {
		return "Student [name=" + name + "]";
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
