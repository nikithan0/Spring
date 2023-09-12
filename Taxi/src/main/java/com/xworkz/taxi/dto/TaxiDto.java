package com.xworkz.taxi.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Taxi")
@NamedQuery(name="updateEarnings", query="update TaxiDto dto set dto.earnings=:earni where dto.id=:id")
@NamedQuery(name="updateTaxiAvailable", query="update TaxiDto dto set dto.isAvailable=:av where id =:id")
@NamedQuery(name="findTaxiBy", query="select dto from TaxiDto dto where dto.location=:Ln")
@NamedQuery(name="taxiAvailable", query="select dto from TaxiDto dto where dto.isAvailable=:available")
@NamedQuery(name = "findByLocation", query="select dto from TaxiDto dto where dto.location=:ln")
@NamedQuery(name="readAll", query ="select dto from TaxiDto dto")

@Entity
public class TaxiDto{
	
	@Id	
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int taxiNo;
	private int earnings;
	private boolean isAvailable;
	private String location;
	private String trips;
	
//	public TaxiDto(int taxiNo, int earnings, boolean isAvailable, String location, String trips) {
//		super();
//		this.taxiNo = taxiNo;
//		this.earnings = earnings;
//		this.isAvailable = isAvailable;
//		this.location = location;
//		this.trips = trips;
//	}
	

}
