package com.xworkz.cars.apps;

import org.springframework.stereotype.Component;

@Component(value="hyundai")
public class Hyundai implements CarsIntTwo{

	@Override
	public void consumeFuel() {
		System.out.println("From car Hyundai");
		
	}

	@Override
	public void comfortableTravelling() {
	System.out.println("Comfortable travelling from Hyundai	");
		
	}

}
