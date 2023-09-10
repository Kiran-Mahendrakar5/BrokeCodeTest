package com.xworkz.college.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.college.dto.CollegeDto;

public class CollegeRepoImpl implements CollegeRepo {

	 EntityManagerFactory emf = Persistence.createEntityManagerFactory("college");
	 EntityManager em = emf.createEntityManager();

	@Override
	public boolean save(CollegeDto dto){
		
		if (em != null) {
			System.out.println("save method from Repo");
			em.persist(dto);
			em.getTransaction().commit();
			System.out.println("data saved successfully");	
				return true;
		}
		return false;

	}

	@Override
	public List<CollegeDto> readAll() {
		Query query = em.createNamedQuery("readAll");
		List<CollegeDto> data = query.getResultList();
		em.getTransaction().commit();
		return data;
	}

}
