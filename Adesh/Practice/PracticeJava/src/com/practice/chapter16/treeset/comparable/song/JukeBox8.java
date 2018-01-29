package com.practice.chapter16.treeset.comparable.song;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

import com.practice.chapter16.hashset.equals.song.Song3;

public class JukeBox8 {

	ArrayList<Song3> songList = new ArrayList<Song3>();

	public static void main(String[] args) {
		new JukeBox8().go();
	}

	private void go() {
		getSongs();
		System.out.print("Without sorting==>\nTitle = " + songList + "\n");
		Collections.sort(songList);
		System.out.print("\nAfter sorting by title==>\nTitle = " + songList
				+ "\n");
		// for sorting use TreeSet
		TreeSet<Song3> songSet = new TreeSet<Song3>();
		songSet.addAll(songList);
		System.out.print("\nAfter using hashset ==>\nTitle = " + songSet);
	}

	private void getSongs() {
		try {
			File file = new File(
					"D:/swabhav techlabs/adesh/Practice/PracticeJava/src/com/practice/chapter16/comparable/song/SongListMore.txt");
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

		Song3 nextSong = new Song3(tokens[0], tokens[1], tokens[2], tokens[3]);
		songList.add(nextSong);
	}

}
