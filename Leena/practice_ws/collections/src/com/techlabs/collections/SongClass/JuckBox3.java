package com.techlabs.collections.SongClass;
import java.util.*;
import java.io.*;
import com.techlabs.collections.withString.Song;

public class JuckBox3 {

	ArrayList<Song> songList = new ArrayList<Song>();

	public static void main(String[] args) {
		new JuckBox3().go();
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
	}

	void getSongs() {
		try {
			File file = new File("C:/Users/Leena/Desktop/SongList.txt");
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
		System.out.println(tokens.length);
		//System.out.println(tokens[1]);
		Song nextSong=new Song(tokens[0],tokens[1],tokens[2],tokens[3]);
		System.out.println(nextSong.getArtist());
		//for(Song index:nextSong){
			songList.add(nextSong);
			//}
		

         System.out.println(songList.size());

		
	}
	
		}


