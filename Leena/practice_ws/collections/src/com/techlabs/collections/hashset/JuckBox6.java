package com.techlabs.collections.hashset;

import java.util.*;
import java.io.*;
import com.techlabs.collections.withString.Song;

public class JuckBox6 {

	ArrayList<Song> songList = new ArrayList<Song>();

	public static void main(String[] args) {
		new JuckBox6().go();
	}

	public void go() {
		getSongs();
		System.out.println("Original LIST : ");
		System.out.println(songList);
		System.out.println();
		System.out
				.println("====================================================================");
		System.out.println("After using Collection.sort function :");
		Collections.sort(songList);
		System.out.println(songList);

		HashSet<Song> songSet = new HashSet<Song>();
		songSet.addAll(songList);
		System.out
				.println("====================================================================");
		System.out.println("After using HASHSET  function :");
		System.out.println(songSet);

	}

	void getSongs() {
		try {
			File file = new File("C:/Users/Leena/Desktop/SongListMore.txt");
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
		Song nextSong = new Song(tokens[0], tokens[1], tokens[2], tokens[3]);
		for (String index : tokens) {
			songList.add(index);
		}

	}

}
