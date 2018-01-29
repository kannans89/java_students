package com.techlabs.Map;

public class Student implements Comparable {
	private int id;
	private int standered;
	private String name;

	public int getId() {
		return id;
	}

	public Student(int id, int standered, String name) {
		this.id = id;
		this.standered = standered;
		this.name = name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getStandered() {
		return standered;
	}

	public void setStandered(int standered) {
		this.standered = standered;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString(Student s) {
		return s.getName();

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + standered;
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
		if (id != other.id)
			return false;
		if (standered != other.standered)
			return false;
		return true;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
