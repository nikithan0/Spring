package com.xworkz.flowers.infos;

import org.springframework.stereotype.Component;

@Component
public class Daisy implements Flowers {

	@Override
	public void hasFragrance() {
		System.out.println("Fragrance from Daisy");

	}

	@Override
	public void useInDecorations() {
		System.out.println("Daisy for Decorations...");

	}

}
