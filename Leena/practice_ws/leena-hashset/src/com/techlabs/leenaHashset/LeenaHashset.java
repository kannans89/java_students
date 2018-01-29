package com.techlabs.leenaHashset;
import java.util.HashMap;
import java.util.Map;

public class LeenaHashset<T> {
	
	private Integer s=0;
	private Map<T,Integer> map;
	
	public LeenaHashset(){
	 map=new HashMap<T, Integer>();
	}

	public  void add(T no){
		map.put(no,s);
	}
	
	@Override
	public String toString(){
		//return "Keys are :"+map.keySet()+" with values :"+ map.values();
		return "map is :"+map;
	}
}
