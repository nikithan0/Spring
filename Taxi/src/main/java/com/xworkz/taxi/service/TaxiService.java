package com.xworkz.taxi.service;

import java.util.List;

import com.xworkz.taxi.dto.TaxiDto;

public interface TaxiService {
	

public boolean save(TaxiDto dto);
	
	public List<TaxiDto> readAll();
	
	public boolean updateEarnings(int id, int earnings);
	
	public boolean updateTaxiAvailableByID(int id ,  boolean status);
	
	public TaxiDto findTaxiByLocation(String location);

	public List<TaxiDto> findAllTaxiWhichIsAvailable(boolean available);
	
	public List<TaxiDto> findByLocation(String location);
	
	public boolean dtoExist(String location);
	
	public TaxiDto bookTaxi();
	
	


}
