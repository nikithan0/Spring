package com.xworkz.socialmediaapps;

public class WeChat implements SocialMediaInterface{

	@Override
	public void messaging() {
		System.out.println("Message from WeChat");	
	}

	@Override
	public void uploadVedio() {
		System.out.println("UploadVedio from WeChat");	
	}

}
