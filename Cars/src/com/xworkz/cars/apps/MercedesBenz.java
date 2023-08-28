package com.xworkz.cars.apps;

import org.springframework.stereotype.Component;

@Component(value="mercedes")
public class MercedesBenz implements CarsIntOne {

	@Override
	public void activeSuspension() {
		System.out.println(" MercedesBenz have active suspension system");
	}

	@Override
	public void sportyVehicle() {
		System.out.println("Mercedes-Benz SL-Class is for Most Comfortable Luxury Sports Car");

	}

}
