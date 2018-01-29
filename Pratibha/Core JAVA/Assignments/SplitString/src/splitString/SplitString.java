package splitString;

public class SplitString {
	public static void main(String args[]) {
		String str1 = "Swabha.Techlab.Pratibha";
		String str2 = str1;
		String[] s1 = str1.split(" ", 3);
		for (String i : s1)
			System.out.println(i);
		String[] s2 = str2.split("\\.");
		for (String i : s2)
			System.out.println(i);
		String s3 = str1.substring(4, 12);
		System.out.println(s3);

	}
}
