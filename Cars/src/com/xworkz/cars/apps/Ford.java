package com.xworkz.cars.apps;

import org.springframework.stereotype.Component;

@Component
public class Ford implements CarsIntTwo{

	@Override
	public void consumeFuel() {
	System.out.println("Fuel from Ford");
		
	}

	@Override
	public void comfortableTravelling() {
		System.out.println("Comfortable travelling in Ford");
		
	}

}
