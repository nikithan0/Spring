package com.xworkz.test;

public class Pattern2 {
	public static void main(String[] args) {
		int x = 5;
		int y = 1;
		
		for(int i=1; i<=x; i++) {
			for(int j=x-1; j>i; j--) {
				System.out.print(" ");
			}
			for(int k=i-1; k>=-(i-1); k--) {
				System.out.print(y-Math.abs(k));
			}
			y+=2;
			System.out.println( );			
		}
	}
}
