package com.xworkz.taxi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.taxi.dto.TaxiDto;
import com.xworkz.taxi.repo.TaxiRepo;
import com.xworkz.taxi.repo.TaxiRepoImpl;

@Component
public class TaxiServiceImpl implements TaxiService {

//	
	TaxiRepo repo = new TaxiRepoImpl();

	@Override
	public boolean save(TaxiDto dto) {
//		if (!dtoExist(dto.getLocation())) {
			if (dto != null) {
				if (dto.getId() > 0) {
					if (dto.getTaxiNo() != 0) {
						if (dto.getEarnings() > 1000) {
							if (dto.getLocation() != null && dto.getLocation().length() >= 3) {
								if (dto.getTrips() != null) {
									System.out.println("Data are valid and Saved");
									return repo.save(dto);
								}
								System.out.println("Given trip is not valid");
								return false;
							}
							System.out.println("The given location is not valid");
							return false;
						}
						System.out.println("The earnings are not valid");
						return false;
					}
					System.out.println("The taxi no. is null");
					return false;
				}
				System.out.println("Id is not valid");
				return false;
			}
			System.out.println("dto is not valid, dto is null");
			return false;
		}
//		System.out.println("Dto is already exist");
//		return false;
//	}

	@Override
	public List<TaxiDto> readAll() {
		return repo.readAll();
	}

	@Override
	public boolean updateEarnings(int id, int earnings) {
		if (id > 0) {
			if (earnings != 0) {
				return repo.updateEarnings(id, earnings);
			}
		}
		return false;
	}

	@Override
	public boolean updateTaxiAvailableByID(int id, boolean status) {
		if (id != 0) {

			return repo.updateTaxiAvailableByID(id, status);

		}
		return false;
	}

	@Override
	public TaxiDto findTaxiByLocation(String location) {
		if (location != null) {
			return repo.findTaxiByLocation(location);
		}
		return null;
	}

	@Override
	public List<TaxiDto> findAllTaxiWhichIsAvailable(boolean available) {
		return repo.findAllTaxiWhichIsAvailable(available);
	}

	@Override
	public List<TaxiDto> findByLocation(String location) {

		List<TaxiDto> list = repo.findByLocation(location);
		if (list != null) {
			System.out.println("Given dto is not null from service");
			return list;
		}
		System.out.println("From service");
		return null;
	}

	@Override
	public boolean dtoExist(String location) {
		if (findByLocation(location) != null) {
			System.out.println("Dto is not null from service");
			return true;
		}
		System.out.println("From service");
		return false;
	}

	public TaxiDto bookTaxi() {
		return repo.bookTaxi();

	}
}
