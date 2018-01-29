package com.practice.chapter52;

public enum InstrumentType {
	GUITAR, BANJO, MANDOLIN, DOBRO, FIDDLE, BASS;
	
	public String toString(){
		switch(this){
		case GUITAR: return "Guitar";
		case BANJO: return "Banjo";
		case MANDOLIN: return "Mandolin";
		case DOBRO: return "Dobro";
		case BASS: return "Bass";
		case FIDDLE: return "Fiddle";
		default: return "unspecified";
		}
	}
}
