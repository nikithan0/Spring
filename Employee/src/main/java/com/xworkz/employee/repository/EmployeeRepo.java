package com.xworkz.employee.repository;

import java.util.List;

import com.xworkz.employee.dto.EmployeeDto;

public interface EmployeeRepo {
	
	public boolean save(EmployeeDto dto);

	public EmployeeDto findById(int id);

//	public EmployeeDto findByIdAndName(int id, String name);
	
	public boolean updateExperianceByName(float exp, String name);
	
	public boolean deleteByName(String name);
	
	public List<EmployeeDto> readAll();

}
