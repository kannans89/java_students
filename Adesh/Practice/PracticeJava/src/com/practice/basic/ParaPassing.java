package com.practice.basic;

public class ParaPassing {
	
	public static void print(String text){
		System.out.print(text);
	}
	
	public static void print(String []name){
		for(String x:name){
			System.out.print(x+" ");
		}
	}
	
	public static void print(int []nums){
		for(int i=0;i<nums.length;i++){
			System.out.print(nums[i]+" ");
		}
	}

	public static void main(String []args){
		String []fullName = {"chapters","to","adesh"};
		int []nos = {1,2,3,4,5};
		
		print("size of the array "+args.length+"\n");
		for(int i=0;i<args.length;i++){
			print(args[i]+" ");
		}
		print(nos);
		print(fullName);
		
	}

}
