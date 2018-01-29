package com.practice.chapter6.command;

public class StereoOnWithCDCommand implements Command{

	Stereo stereo;
	
	public StereoOnWithCDCommand(Stereo stereo){
		this.stereo = stereo;
	}
	public void execute() {
		stereo.on();
		stereo.setCd();
		stereo.setVolume();
	}

}
