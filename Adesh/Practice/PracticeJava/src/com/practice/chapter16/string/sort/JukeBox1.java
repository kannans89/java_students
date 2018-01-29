package com.practice.chapter16.string.sort;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;

public class JukeBox1 {

	ArrayList<String> songList = new ArrayList<String>();

	public static void main(String[] args) {
		new JukeBox1().go();
	}

	private void go() {
		getSongs();
		print(songList);
		Collections.sort(songList);
		print(songList);
	}

	private void print(ArrayList<String> songList) {
		for (String x : songList) {
			System.out.print(x+" ");
		}
		System.out.println("");
	}

	private void getSongs() {
		try {
			File file = new File("D:/swabhav techlabs/adesh/Practice/PracticeJava/src/com/practice/chapter16/string/sort/SongList.txt");
			@SuppressWarnings("resource")
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line = null;
			while ((line = reader.readLine()) != null) {
				addSong(line);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	private void addSong(String lineToParse) {
		String[] tokens = lineToParse.split("/");
		songList.add(tokens[0]);
	}

}
