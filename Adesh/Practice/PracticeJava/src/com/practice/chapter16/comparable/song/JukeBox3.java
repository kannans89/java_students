package com.practice.chapter16.comparable.song;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;

public class JukeBox3 {
	
	ArrayList<Song> songList = new ArrayList<Song>();
	
	public static void main(String[] args) {
		new JukeBox3().go();
	}

	private void go() {
		getSongs();
		System.out.println("Without sorting==>\nTitle = "+songList);
		Collections.sort(songList);
		System.out.println("\nAfter sorting by title==>\nTitle = "+songList);
	}

	@SuppressWarnings("unused")
	private void print(ArrayList<Song> songList) {
		for (Song x : songList) {
			System.out.print(x+" ");
		}
		System.out.println("");
	}
	
	private void getSongs() {
		try {
			File file = new File("D:/swabhav techlabs/adesh/Practice/PracticeJava/src/com/practice/chapter16/comparable/song/SongListMore.txt");
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
		
		Song nextSong = new Song(tokens[0], tokens[1], tokens[2], tokens[3]);
		songList.add(nextSong);
	}


}
