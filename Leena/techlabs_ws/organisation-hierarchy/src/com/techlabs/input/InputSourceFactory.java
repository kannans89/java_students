package com.techlabs.input;

public class InputSourceFactory {
	
	public static IInputSource createSource(SourceType source){
		if(source.equals(SourceType.DBReader)){
			return new DBReader();
		}else{
			if(source.equals(SourceType.FileReader)){
				return new DataFromFile();
			}
		}
		
		return null;
	}

}
