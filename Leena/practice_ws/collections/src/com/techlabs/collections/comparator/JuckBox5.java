package com.techlabs.collections.comparator;

import java.util.*;
import java.io.*;

import com.techlabs.collections.withString.Song;

public class JuckBox5 {

	ArrayList<Song> songList = new ArrayList<Song>();

	public static void main(String[] args) {
		new JuckBox5().go();
	}

	public void go() {
		getSongs();
		System.out.println("Original LIST : ");
		System.out.println(songList);
		System.out.println();
		System.out.println("====================================================================");
		System.out.println("After using Collection.sort function :");
		Collections.sort(songList);
		System.out.println(songList);
		
		ArtistCompare artistCompare=new ArtistCompare();
		Collections.sort(songList,artistCompare);
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
		Song nextSong=new Song(tokens[0],tokens[1],tokens[2],tokens[3]);
		//for(Song index:nextSong){
			songList.add(nextSong);
			//}
		



		
	}
	
		}


