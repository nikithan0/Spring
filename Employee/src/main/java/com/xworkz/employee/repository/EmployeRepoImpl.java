package com.xworkz.employee.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Component;

import com.xworkz.employee.dto.EmployeeDto;

@Component
public class EmployeRepoImpl implements EmployeeRepo{

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("employeedatabase");
	
	EntityManager em =emf.createEntityManager();
	
	@Override
	public boolean save(EmployeeDto dto) {
		if (em != null) {
			EntityTransaction transaction = em.getTransaction();
			transaction.begin();
			em.persist(dto);
			transaction.commit();
			System.out.println("Data is saved successfully");
			return true;
		}
		return false;
	}

	@Override
	public EmployeeDto findById(int id) {
		if (em != null) {
			TypedQuery<EmployeeDto> query = em.createNamedQuery("findById", EmployeeDto.class);
			query.setParameter("id", id);
			EmployeeDto dto = query.getSingleResult();
			System.out.println("Data is found");
			return dto;
		}
		return null;
	}

	@Override
	public boolean updateExperianceByName(float exp, String name) {
		
		return false;
	}

	@Override
	public boolean deleteByName(String name) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<EmployeeDto> readAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
