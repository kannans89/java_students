package serialization;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Serialisation implements Serializable {
	private int id;
	private String name;
	private transient int age;

	public Serialisation(int id, String name, int age) {
		this.setId(id);
		this.setName(name);
		this.setAge(age);
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
