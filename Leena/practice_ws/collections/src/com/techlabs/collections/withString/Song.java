package com.techlabs.collections.withString;

public class Song implements Comparable<Song>{
	String title;
	String artist;
	String rating;
	String bpm;
	
	public boolean equals(Object aSong){
		Song s=(Song) aSong;
		return getTitle().equals(s.getTitle());
	}
	
	public int hashCode(){
		return title.hashCode();
	}
	
	public int compareTo(Song s){
		return title.compareTo(s.getTitle());
	}
	
	public Song(String title,String artist,String rate,String bpm){
		this.title=title;
		this.artist=artist;
		this.rating=rate;
		this.bpm=bpm;
	}
	
	public String getTitle(){
		return title;
	}
	
	public String getArtist(){
		return artist;
	}
	
	public String getRating(){
		return rating;
	}
	
	public String getBPM(){
		return bpm;
	}
	
	@Override
	public String toString(){
		return title;
	}
}
