package student;

public class StaticStudent {
	private static String name;
	private static int age;
	private static int id;

	@SuppressWarnings("static-access")
	public StaticStudent(String name, int id, int age) {
		this.name = name;
		this.id = id;
		this.age = age;
	}

	public static void setData(String name, int id, int age) {
		StaticStudent.setName(name);
		StaticStudent.setId(id);
		StaticStudent.setAge(age);
	}

	public static int getId() {
		return id;
	}

	public static void setId(int id) {
		StaticStudent.id = id;
	}

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		StaticStudent.name = name;
	}

	public static int getAge() {
		return age;
	}

	public static void setAge(int age) {
		StaticStudent.age = age;
	}
}
