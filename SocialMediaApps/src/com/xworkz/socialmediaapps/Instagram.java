package com.xworkz.socialmediaapps;

public class Instagram implements SocialMediaInterface{

	@Override
	public void messaging() {
		System.out.println("Messaging from instagram");
	}

	@Override
	public void uploadVedio() {
		System.out.println("uploadVedio from instagram");
	}
	

}
