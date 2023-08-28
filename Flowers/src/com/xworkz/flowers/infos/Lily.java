package com.xworkz.flowers.infos;

import org.springframework.stereotype.Component;

@Component
public class Lily implements Flowers{

	@Override
	public void hasFragrance() {
		System.out.println("Fragrance from Lily");
	}

	@Override
	public void useInDecorations() {
		System.out.println("Lily for Decorations...");
	}

}
