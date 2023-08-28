package com.xworkz.flowers.infos;

import org.springframework.stereotype.Component;

@Component
public class FlowerRose implements Flowers {

	@Override
	public void hasFragrance() {
		System.out.println("Fragrance from Rose");
	}

	@Override
	public void useInDecorations() {
		System.out.println("Rose for Decorations");
	}

}
