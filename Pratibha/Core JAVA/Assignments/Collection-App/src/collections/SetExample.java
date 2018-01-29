package collections;

import java.util.HashSet;

public class SetExample {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();

		hs.add("first");
		hs.add("second");
		hs.add("third");
		hs.add("Four");
		hs.add("Four");
		System.out.println(hs);

		@SuppressWarnings("unchecked")
		HashSet<String> h = (HashSet<String>) hs.clone();

		System.out.println(h);
		System.out.println("Is HashSet empty? " + hs.isEmpty());

		hs.remove("third");

		System.out.println(hs);
		System.out.println("Size of the HashSet: " + hs.size());
		System.out.println("Does HashSet contains first element? "
				+ hs.contains("first"));
		System.out.println("HashSet: " + hs);
		hs.clear();
		System.out.println("After clear HashSet:" + hs);
	}
}