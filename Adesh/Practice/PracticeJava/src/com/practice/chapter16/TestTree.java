package com.practice.chapter16;

import java.util.TreeSet;

public class TestTree {

	public static void main(String[] args) {
		new TestTree().go();
	}

	private void go() {
		Magazine magazine1 = new Magazine("Mrutyunjay");
		Magazine magazine2 = new Magazine("shivba");
		Magazine magazine3 = new Magazine("2 states");
		Magazine magazine4 = new Magazine("2 states");

		TreeSet<Magazine> tree = new TreeSet<Magazine>();
		tree.add(magazine1);
		tree.add(magazine2);
		tree.add(magazine3);
		tree.add(magazine4);
		System.out.println("Title = " + tree);
		/*
		 * for(Magazine x:tree){ System.out.print(x+", "); }
		 */
	}

}

class Magazine implements Comparable<Object> {
	String title;

	public Magazine(String t) {
		title = t;
	}

	@Override
	public int compareTo(Object aMagazine) {
		Magazine m = (Magazine) aMagazine;
		return title.compareTo(m.title);
	}

	@Override
	public String toString() {
		return title;
	}
}