package com.xworkz.flowers;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.flowers.config.FlowersConfig;
import com.xworkz.flowers.infos.Daisy;
import com.xworkz.flowers.infos.FlowerRose;
import com.xworkz.flowers.infos.Flowers;
import com.xworkz.flowers.infos.Jasmine;
import com.xworkz.flowers.infos.Lily;
import com.xworkz.flowers.infos.Marigold;

public class FlowersRunner {
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(FlowersConfig.class);
		
		Flowers fl = context.getBean(Daisy.class);
		fl.hasFragrance();
		fl.useInDecorations();
		
		System.out.println("                                               ");
		
		Flowers fl2 = context.getBean(FlowerRose.class);
		fl2.hasFragrance();
		fl2.useInDecorations();
		
		System.out.println("                                               ");
		
		Flowers fl3 = context.getBean(Jasmine.class);
		fl3.hasFragrance();
		fl3.useInDecorations();
		
		System.out.println("                                               ");
		
		Flowers fl4 = context.getBean(Lily.class);
		fl4.hasFragrance();
		fl4.useInDecorations();
		
		System.out.println("                                               ");
		
		Flowers fl5 = context.getBean(Marigold.class);
		fl5.hasFragrance();
		fl5.useInDecorations();
	}
}
