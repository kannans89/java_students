package com.tictac;

public class Tester {

	public static void main(String[] args) {
		int[][] a= new int[3][3];
		a[0][0]=1; a[0][1]=5; a[0][2]=1; 
		a[1][0]=1; a[1][1]=1; a[1][2]=1; 
		a[2][0]=2; a[2][1]=1; a[2][2]=1; 
		
		
//		for (int i = 0; i < 3; i++) {
//			for (int j = 0; j < 2; j++) {
//				if(a[i][j]!=a[i][j+1]){
////					System.out.println("not equal");
//					break;
//				}
//				if(j==1){
//					System.out.println(" return equal");
//				}
//				
//			}
//		}
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				
				if(a[j][i]!=a[j+1][i]){
					System.out.println("not equal");
					break;
				}
				if(j==1){
					System.out.println(" return equal");
				}
				
			}
		}
		
		
		

	}

}
