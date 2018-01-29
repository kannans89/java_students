package com.techlabs.entity;

import java.util.Set;

public class Organizer {

	private int id;
	private String name;
	private long contact;
	private Set<Exhibition> list;

	public Set<Exhibition> getList() {
		return list;
	}

	public void setList(Set<Exhibition> list) {
		this.list = list;
	}

	public Organizer() {
		// TODO Auto-generated constructor stub
	}

	public Organizer(String name, long contact) {
		this.name = name;
		this.contact = contact;
	}

	@Override
	public String toString() {
		return "Organizer [id=" + id + ", name=" + name + ", contact="
				+ contact + ", list=" + list + "]";
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

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

}
