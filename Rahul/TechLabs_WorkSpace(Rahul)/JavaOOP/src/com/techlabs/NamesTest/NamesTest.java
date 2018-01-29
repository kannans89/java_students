/*package com.techlabs.NamesTest;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class NamesTest {

	public static void main(String[] args) {

		Set<String> hashSet = new HashSet<String>();  //shows random output
		Set<String> linkedHashSet = new LinkedHashSet<String>(); //shows output in order of insertion
		Set<String> treeSet = new TreeSet<String>(); // shows output in sorted way

		try {
			BufferedReader reader = new BufferedReader(new FileReader(new File("Names.txt")));
			String line = null;
			while ((line = reader.readLine()) != null) {
				hashSet.add(line);
				linkedHashSet.add(line);
				treeSet.add(line);
			}

			System.out.println("Hash Set output : " + hashSet);
			System.out.println("Linked Hash Set output : " + linkedHashSet);
			System.out.println("Tree Set output : " + treeSet);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
*/