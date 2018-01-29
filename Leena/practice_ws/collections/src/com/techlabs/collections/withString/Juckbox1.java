package com.techlabs.collections.withString;

import java.util.*;
import java.io.*;

public class Juckbox1 {

	ArrayList<String> songList = new ArrayList<String>();

	public static void main(String[] args) {
		new Juckbox1().go();
	}

	public void go() {
		getSongs();
		System.out.println("Original LIST : ");
		System.out.println(songList);
		System.out.println();
		System.out.println("====================================================================");
		System.out.println("After using Collection.sort function :");
		Collections.sort(songList);
		System.out.println(songList);
	}

	void getSongs() {
		try {
			File file = new File("C:/Users/Leena/Desktop/SongList.txt");
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line = null;

			while ((line = reader.readLine()) != null) {
				addSong(line);
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	void addSong(String line) {
		String[] tokens = line.split("/");
		for(String index:tokens){
		songList.add(index);
		}

	}

}
