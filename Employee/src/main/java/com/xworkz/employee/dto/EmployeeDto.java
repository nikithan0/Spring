package com.xworkz.employee.dto;



import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.xworkz.employee.constants.Gender;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="employe-info")
@Entity


public class EmployeeDto implements Serializable{

	@Id
	private int id;
	private String name;
	private String position;
	private String joingDate;
	private float experience;
	private String address;
	private String qualification;
	private float age;
	private Gender gender;
	private Long contactNo;
}
