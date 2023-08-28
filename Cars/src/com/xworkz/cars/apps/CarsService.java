package com.xworkz.cars.apps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CarsService {
	
	@Autowired
	@Qualifier(value="mercedes")
	private CarsIntOne cars;
	
	
	@Autowired
	@Qualifier("hyundai")
	private CarsIntTwo cars1;
	
	
	public void carsMethod() {
		cars.activeSuspension();
		cars.sportyVehicle();
		
		System.out.println("                        ");
		
		
		cars1.comfortableTravelling();
		cars1.consumeFuel();
		
	}
	
	
	

}
