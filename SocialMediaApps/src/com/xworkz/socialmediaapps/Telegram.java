package com.xworkz.socialmediaapps;

public class Telegram implements SocialMediaInterface{

	@Override
	public void messaging() {
		System.out.println("Messaging from Telegram");
	}

	@Override
	public void uploadVedio() {
		System.out.println("UploadVedio from Telegram");	
	}
	

}
