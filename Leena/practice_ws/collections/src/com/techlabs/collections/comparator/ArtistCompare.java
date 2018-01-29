package com.techlabs.collections.comparator;

import java.util.Comparator;

import com.techlabs.collections.withString.Song;

public class ArtistCompare implements Comparator<Song>{
	
	
	public int compare(Song one,Song two){
		return one.getArtist().compareTo(two.getArtist());
	}

	

}
