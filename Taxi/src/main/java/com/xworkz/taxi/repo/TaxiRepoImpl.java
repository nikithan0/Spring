package com.xworkz.taxi.repo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.taxi.dto.TaxiDto;

@Component
public class TaxiRepoImpl implements TaxiRepo {

//	@Autowired
//	private EntityManagerFactory emf;
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("databaseProperties");

	@Override
	public boolean save(TaxiDto dto) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		em.persist(dto);
		transaction.commit();
		System.out.println("Data saved succefully");
		return true;
	}

	@Override
	public List<TaxiDto> readAll() {
		EntityManager em = emf.createEntityManager();
		Query query = em.createNamedQuery("readAll");
		List<TaxiDto> list = query.getResultList();
		return list;
	}

	@Override
	public boolean updateEarnings(int id, int earnings) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		Query query = em.createNamedQuery("updateEarnings");
		query.setParameter("id", id);
		query.setParameter("earni", earnings);
		query.executeUpdate();
		transaction.commit();
		System.out.println("updated successfully");
		return true;
	}

	@Override
	public boolean updateTaxiAvailableByID(int id, boolean status) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		Query query = em.createNamedQuery("updateTaxiAvailable");
		query.setParameter("id", id);
		query.setParameter("av", status);
		query.executeUpdate();
		System.out.println("updated successfully");
		return true;
	}

	@Override
	public TaxiDto findTaxiByLocation(String location) {
		EntityManager em = emf.createEntityManager();
		TypedQuery<TaxiDto> query = em.createNamedQuery("findTaxiBy", TaxiDto.class);
		query.setParameter("Ln", location);
		TaxiDto dto = query.getSingleResult();

		System.out.println("data Founded successfully");
		return dto;
	}

	@Override
	public List<TaxiDto> findAllTaxiWhichIsAvailable(boolean available) {
		EntityManager em = emf.createEntityManager();
		Query query = em.createNamedQuery("taxiAvailable", TaxiDto.class);
		query.setParameter("available", available);
		List<TaxiDto> dto = query.getResultList();

		for (TaxiDto list : dto) {
			System.out.println(list);
		}
		return dto;
	}

	@Override
	public List<TaxiDto> findByLocation(String location) {
		EntityManager em = emf.createEntityManager();
		TypedQuery<TaxiDto> query = em.createNamedQuery("findByLocation", TaxiDto.class);
		query.setParameter("ln", location);
		if(query!=null) {
		List<TaxiDto> list = query.getResultList();
		if(!list.isEmpty()) {
			System.out.println("Dto is not null from repo");
			return list;
		}
		}
		System.out.println("dto is null");
		return null;
	}

	@Override
	public TaxiDto bookTaxi() {
		EntityManager em = emf.createEntityManager();
		if(em!=null) {
			List<TaxiDto> dtos = findAllTaxiWhichIsAvailable(true);
			
			MyComparator cmp = new MyComparator();
			
			Collections.sort(dtos, cmp);
			
			for(TaxiDto li : dtos) {
				System.out.println(li);
			}
			
			for(TaxiDto lis : dtos) {
				int eachEarnings = 200;
				int updatedEarnings = lis.getEarnings()+eachEarnings;
				System.out.println(updatedEarnings);
				
				updateEarnings(updatedEarnings, lis.getId());
				updateTaxiAvailableByID(lis.getId(), false);
				System.out.println(lis);
				return lis;				
			}
		}
		return null;
	}



	

}
