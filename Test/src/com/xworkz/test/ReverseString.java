package com.xworkz.test;

public class ReverseString {
	
	
	
	public static String reverse(String words) {
		
		StringBuilder build = new StringBuilder();
		
		String[] arr = words.split(" ");
		for(int i=arr.length-1; i>=0; i--) {
			build.append(arr[i]);
			if(i>0) {
				build.append(" ");
			}
		}
		return build.toString();	
	}

	public static void main(String[] args) {
		String word = "Hello World";		
		String reverse =reverse(word);
		System.out.println(reverse);
		
	
		
		

	}

}
