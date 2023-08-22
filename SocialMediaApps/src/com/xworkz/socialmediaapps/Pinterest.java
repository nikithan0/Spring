package com.xworkz.socialmediaapps;

public class Pinterest implements SocialMediaInterface{

	@Override
	public void messaging() {
	System.out.println("Messaging from Pinterest");	
	}

	@Override
	public void uploadVedio() {
		System.out.println("Vedio upload from Pinterest");
	}
	

}
