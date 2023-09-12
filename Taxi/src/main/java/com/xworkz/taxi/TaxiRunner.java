package com.xworkz.taxi;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.taxi.config.TaxiConfig;
import com.xworkz.taxi.dto.TaxiDto;
import com.xworkz.taxi.service.TaxiService;
import com.xworkz.taxi.service.TaxiServiceImpl;

public class TaxiRunner {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(TaxiConfig.class);
		
		TaxiDto dto = new TaxiDto(1, 1432, 7000, true, "JP Nagar", "3");
		TaxiDto dto2 = new TaxiDto(5, 1024, 5600, true , "Banashankari", "5");
		
		
//		TaxiService service = context.getBean(TaxiServiceImpl.class);
		
		TaxiService service = new TaxiServiceImpl();
//		service.save(dto);
//		service.save(dto2);
		
		service.updateTaxiAvailableByID(6, true);
		service.updateTaxiAvailableByID(7, true);
		service.updateTaxiAvailableByID(8, true);
		service.updateTaxiAvailableByID(10, true);
		service.updateTaxiAvailableByID(11, true);
		service.updateTaxiAvailableByID(12, true);
		
		
		
//		boolean update = service.updateEarnings(1, 6000);
//		System.out.println(update);
		
//		service.findTaxiByLocation("Shivajinagar");
//		
//		List<TaxiDto> li = service.findAllTaxiWhichIsAvailable(true);
//		System.out.println(li);
		
		List<TaxiDto> list = service.readAll();
		System.out.println(list);
		
//		service.dtoExist(dto.getLocation());

//		List<TaxiDto> dtos =service.bookTaxi();
//		System.out.println(dtos);
		
		
		

	}

}
