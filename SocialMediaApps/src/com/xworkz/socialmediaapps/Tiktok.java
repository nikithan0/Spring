package com.xworkz.socialmediaapps;

public class Tiktok implements SocialMediaInterface{

	@Override
	public void messaging() {
		System.out.println("Messaging from Tiktok");
	}

	@Override
	public void uploadVedio() {
		System.out.println("uploadVedio from Tiktok");
	}

}
