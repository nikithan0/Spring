package com.xworkz.socialmediaapps;

public class WhatsApp implements SocialMediaInterface{

	@Override
	public void messaging() {
		System.out.println("Messaging from Whatsapp");
	}

	@Override
	public void uploadVedio() {
		System.out.println("uploadVedio from whatsapp");
	}

}
