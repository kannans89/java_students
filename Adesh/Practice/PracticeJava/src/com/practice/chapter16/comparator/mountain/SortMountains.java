package com.practice.chapter16.comparator.mountain;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class SortMountains {

	LinkedList<Mountain> mtn = new LinkedList<Mountain>();

	// comparison by the name.
	class NameCompare implements Comparator<Mountain> {
		public int compare(Mountain one, Mountain two) {
			return one.getName().compareTo(two.getName());
		}
	}

	// comparison by the height.
	class HeightCompare implements Comparator<Mountain> {
		public int compare(Mountain one, Mountain two) {
			return two.getHeight() - one.getHeight();
		}
	}

	public static void main(String[] args) {
		new SortMountains().go();
	}

	private void go() {
		mtn.add(new Mountain("kalsubai", 213343));
		mtn.add(new Mountain("sahyadri", 678456));
		mtn.add(new Mountain("himachal", 56123));
		mtn.add(new Mountain("gangtok", 99564));
		mtn.add(new Mountain("pathari", 3465));

		System.out.println("as entered:\n" + mtn);

		NameCompare nc = new NameCompare();
		Collections.sort(mtn, nc);
		System.out.println("by name:\n" + mtn);

		HeightCompare hc = new HeightCompare();
		Collections.sort(mtn, hc);
		System.out.println("by height:\n" + mtn);
	}

}
