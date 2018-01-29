package day1;

public class Song {

	String title;
	SoundPlayer player=new SoundPlayer();
	public Song(String t) {
		title = t;
	}
	
	
	public void play(){
		player.playSound(title);
		player.stopSound(title);
	}

}
