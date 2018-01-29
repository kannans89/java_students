public class Test {

	public static void main(String[] args) {
		String name = "kannan";
		mutate(name);
		System.out.println(name);
	}

	private static void mutate(String name) {
		name = "sachin";
	}
}
