package com.practice.chapter16.comparator.song;

public class Song2 implements Comparable<Song2> {
	private String title, rating, bpm, artist;

	@Override
	public int compareTo(Song2 s) {
		return title.compareTo(s.getTitle());
	}

	Song2(String title, String artist, String rating, String bpm) {
		this.title = title;
		this.bpm = bpm;
		this.rating = rating;
		this.artist = artist;
	}

	public String getTitle() {
		return title;
	}

	public String getRating() {
		return rating;
	}

	public String getBpm() {
		return bpm;
	}

	public String getArtist() {
		return artist;
	}

	@Override
	public String toString() {
		return title + ": " + artist + ": " + rating + ", ";
	}

}
