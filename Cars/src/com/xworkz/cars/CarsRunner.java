package com.xworkz.cars;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.cars.apps.Audi;
import com.xworkz.cars.apps.CarsIntOne;
import com.xworkz.cars.apps.CarsService;
import com.xworkz.cars.config.CarsConfig;

public class CarsRunner {

	public static void main(String[] args) {
		ApplicationContext context =new AnnotationConfigApplicationContext(CarsConfig.class);

		CarsIntOne cars = context.getBean(Audi.class);
		cars.activeSuspension();
		cars.sportyVehicle();
		
		System.out.println("                                      ");
		
		CarsService service = context.getBean(CarsService.class);
		service.carsMethod();
	
	}

}
