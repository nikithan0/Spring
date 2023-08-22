package com.xworkz.socialmediaapps;

public class Facebook implements SocialMediaInterface{

	@Override
	public void messaging() {
		System.out.println("Messaging from facebook");		
	}

	@Override
	public void uploadVedio() {
		System.out.println("uploading video from facebook");
	}

}
