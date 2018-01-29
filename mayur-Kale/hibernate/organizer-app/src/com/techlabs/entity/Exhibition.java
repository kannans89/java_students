package com.techlabs.entity;

public class Exhibition {
	private int id;
	private String name;
	private String location;
	private Organizer organizer;

	public Exhibition() {
		// TODO Auto-generated constructor stub
	}

	public Exhibition(String name, String location) {
		this.name = name;
		this.location = location;
	}

	@Override
	public String toString() {
		return "Exhibition [id=" + id + ", name=" + name + ", location="
				+ location + ", organizer=" + organizer.getName() + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Organizer getOrganizer() {
		return organizer;
	}

	public void setOrganizer(Organizer organizer) {
		this.organizer = organizer;
	}

}
