package com.practice.chapter16.comparable.song;

public class Song implements Comparable<Song> {
	private String title, rating, bpm, artist;

	@Override
	public int compareTo(Song s) {
		return title.compareTo(s.getTitle());
	}

	public Song(String title, String artist, String rating, String bpm) {
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
		return title ;
	}

}
