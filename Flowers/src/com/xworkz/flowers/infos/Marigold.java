package com.xworkz.flowers.infos;

import org.springframework.stereotype.Component;

@Component
public class Marigold implements Flowers {

	@Override
	public void hasFragrance() {
		System.out.println("Fragrance from Marigold");

	}

	@Override
	public void useInDecorations() {
		System.out.println("Marigold for Decorations...");

	}

}
