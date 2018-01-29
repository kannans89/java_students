package com.practice.chapter16.comparator.song;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class JukeBox5 {

	ArrayList<Song2> songList = new ArrayList<Song2>();

	public static void main(String[] args) {
		new JukeBox5().go();
	}

	//Artist comparison implements comparator.
	class ArtistCompare implements Comparator<Song2> {
		public int compare(Song2 one, Song2 two) {
			return one.getArtist().compareTo(two.getArtist());
		}
	}
	
	//Rating comparison implements comparator.
	class RatingCompare implements Comparator<Song2> {
		public int compare(Song2 one, Song2 two) {
			return one.getRating().compareTo(two.getRating());
		}
	}

	private void go() {
		getSongs();
		System.out.println("WITHOUT sorting==>\nTitle: Artist: Rating = ");
		print(songList);
		Collections.sort(songList);
		System.out.println("\nAfter sorting by TITLE==>\nTitle: Artist: Rating = ");
		print(songList);

		//Artist object
		ArtistCompare artistCompare = new ArtistCompare();
		Collections.sort(songList, artistCompare);
		System.out.println("\nAfter sorting by ARTIST==>\nTitle: Artist: Rating = ");
		print(songList);
		
		//Rating object
		RatingCompare ratingCompare = new RatingCompare();
		Collections.sort(songList, ratingCompare);
		System.out.println("\nAfter sorting by RATING==>\nTitle: Artist: Rating = ");
		print(songList);
	}

	private void print(ArrayList<Song2> songList) {
		for (Song2 x : songList) {
			System.out.print(x + " ");
		}
		System.out.println("");
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

		Song2 nextSong = new Song2(tokens[0], tokens[1], tokens[2], tokens[3]);
		songList.add(nextSong);
	}

}
