package com.xworkz.test;

public class Patterns {

	public static void main(String[] args) {

		int n = 7;
		int x = 1;

		for (int i=1; i<=n; i++) {
			for (int j=0; j<=n; j++) {
				if ((j>=x) != false && j<=n-x+1) {
					System.out.print("* ");
				} else {
					System.out.print(" ");
				}
			}
			if (i<=n/2) {
				x++;
			} else {
				x--;
			}
			System.out.println();
		}
	}
}
