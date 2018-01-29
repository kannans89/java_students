package com.techlabs.engineeringcollege.person;

public abstract class Person {
	// constructor
	public Person(int id, String name, String address, String dateOfBirth) {
		personId = id;
		personName = name;
		personeAddress = address;
		personDOB = dateOfBirth;
	}

	// methods
	public int getId() {
		return personId;
	}

	public String getName() {
		return personName;
	}

	public String getAddress() {
		return personeAddress;
	}

	public String getDOB() {
		return personDOB;
	}

	@Override
	public String toString() {
		return "Person ID :-" + getId() + "\nPersone Name :-" + getName()
				+ "\ngetAddress:-" + getAddress() + "\nDOB:-" + getDOB()
				+ "\n======================================================";
	}

	// Instance Variables
	private int personId;
	private String personName;
	private String personeAddress;
	private String personDOB;
}
