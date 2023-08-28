package com.xworkz.cars.apps;

import org.springframework.stereotype.Component;

@Component
public class Audi implements CarsIntOne {

	@Override
	public void activeSuspension() {
		System.out.println("Predictive active suspension in the Audi ");

	}

	@Override
	public void sportyVehicle() {
		System.out.println("AUDI is a sporty vehicle");

	}

}
