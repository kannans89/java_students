package com.techlabs.music;
import javax.sound.midi.*;

public class MusicTest {

	public static void main(String[] args) {
		MusicTest mt=new MusicTest();
		mt.play();
	}

	private void play() {
		try{
			Sequencer sequencerObj=MidiSystem.getSequencer();
			System.out.println("Successfully got a Sequencer");
		}
		catch(MidiUnavailableException ex){
			System.out.println("Bummer");
		}
	}

}
