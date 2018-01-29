package com.practice.chapter16.hashset.equals.song;

public class Song3 implements Comparable<Song3> {
	private String title, rating, bpm, artist;
	
	public boolean equals(Object aSong){
		Song3 s = (Song3) aSong;
		return getTitle().equals(s.getTitle());
	}
	
	public int hashCode(){
		return title.hashCode();
	}

	@Override
	public int compareTo(Song3 s) {
		return title.compareTo(s.getTitle());
	}

	public Song3(String title, String artist, String rating, String bpm) {
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
		return title;
	}
}
