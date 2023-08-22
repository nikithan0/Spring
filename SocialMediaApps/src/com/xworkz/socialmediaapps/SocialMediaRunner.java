package com.xworkz.socialmediaapps;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.socialmediaapps.config.AppsConfig;

public class SocialMediaRunner {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppsConfig.class);
		
		System.out.println("From Runner");
		
		SocialMediaInterface apps = context.getBean(Facebook.class);
		apps.messaging();
		apps.uploadVedio();
		
		System.out.println("                                                ");
		
		SocialMediaInterface apps1 = context.getBean(Instagram.class);
		apps1.messaging();
		apps1.uploadVedio();
		
		System.out.println("                                                ");
		
		SocialMediaInterface apps2 = context.getBean(Pinterest.class);
		apps2.messaging();
		apps2.uploadVedio(); 
		
		System.out.println("                                                ");
		
		SocialMediaInterface apps3 = context.getBean(ShareChat.class);
		apps3.messaging();
		apps3.uploadVedio();
		
		System.out.println("                                                ");
		
		SocialMediaInterface apps4 = context.getBean(SnapChat.class);
		apps4.messaging();
		apps4.uploadVedio();

		System.out.println("                                                ");
		
		SocialMediaInterface apps5 = context.getBean(Telegram.class);
		apps5.messaging();
		apps5.uploadVedio();
		
		System.out.println("                                                ");
		
		SocialMediaInterface apps6 = context.getBean(Tiktok.class);
		apps6.messaging();
		apps6.uploadVedio();
		
		System.out.println("                                                ");
		
		SocialMediaInterface apps7 = context.getBean(Twitter.class);
		apps7.messaging();
		apps7.uploadVedio();
		
		System.out.println("                                                ");
		
		SocialMediaInterface apps8 = context.getBean(WeChat.class);
		apps8.messaging();
		apps8.uploadVedio();
		
		System.out.println("                                                ");
		
		SocialMediaInterface apps9 = context.getBean(WhatsApp.class);
		apps9.messaging();
		apps9.uploadVedio();
		
		System.out.println("                                                ");
	}

}
