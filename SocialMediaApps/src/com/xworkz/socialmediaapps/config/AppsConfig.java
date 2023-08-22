package com.xworkz.socialmediaapps.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.xworkz.socialmediaapps.Facebook;
import com.xworkz.socialmediaapps.Instagram;
import com.xworkz.socialmediaapps.Pinterest;
import com.xworkz.socialmediaapps.ShareChat;
import com.xworkz.socialmediaapps.SnapChat;
import com.xworkz.socialmediaapps.Telegram;
import com.xworkz.socialmediaapps.Tiktok;
import com.xworkz.socialmediaapps.Twitter;
import com.xworkz.socialmediaapps.WeChat;
import com.xworkz.socialmediaapps.WhatsApp;

@Configuration
public class AppsConfig {
	
	@Bean
	public Facebook getFacebook() {
		return new Facebook();
	}
	
	 @Bean
	public Pinterest getPinterest() {
		 return new Pinterest();
	}
	 
	@Bean
	public Instagram getInstagram() {
		return new Instagram();
	}
	
	@Bean
	public ShareChat getShareChat() {
		return new ShareChat();
	}
	
	@Bean
	public SnapChat getSnapChat() {
		return new SnapChat();
	}
	
	@Bean
	public Telegram getTelegram() {
		return new Telegram();
	}
	
	@Bean 
	public Tiktok getTiktok() {
		return new Tiktok();
	}
	
	@Bean
	public Twitter getTwitter() {
		return new Twitter();		
	}
	
	@Bean 
	public WeChat getWeChat() {
		return new WeChat();
	}
	
	@Bean
	public WhatsApp getWhatsApp() {
		return new WhatsApp();
	}

}
