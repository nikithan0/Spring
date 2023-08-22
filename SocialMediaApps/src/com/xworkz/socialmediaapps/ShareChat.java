package com.xworkz.socialmediaapps;

public class ShareChat implements SocialMediaInterface{

	@Override
	public void messaging() {
		System.out.println("Messaging from ShareChat");	
	}

	@Override
	public void uploadVedio() {
		System.out.println("UploadVedio from ShareChat");		
	}

}
