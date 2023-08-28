package com.xworkz.flowers.infos;

import org.springframework.stereotype.Component;

@Component
public class Jasmine implements Flowers {

	@Override
	public void hasFragrance() {
		System.out.println("Fragrance from Jasmine");

	}

	@Override
	public void useInDecorations() {
		System.out.println("Jasmine for Decorations...");

	}

}
