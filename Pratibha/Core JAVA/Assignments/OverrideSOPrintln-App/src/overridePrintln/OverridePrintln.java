package overridePrintln;

public class OverridePrintln {

	private String name;
	private int age;
	private int id;

	OverridePrintln(String name, int age, int id) {
		this.name = name;
		this.age = age;
		this.id = id;
	}

	public static void main(String[] args) {

		OverridePrintln player = new OverridePrintln("Virat", 29, 2);
		System.out.println("Player=" + player);
	}

	public String toString() {
		return ("\n" + name + "\n" + age + "\n" + id);
	}
}
