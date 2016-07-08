package com.rentalx.vehicle.repository;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.rentalx.vehicle.CarDocument;

@Repository
public class CarDocumentRepository {
	@PersistenceContext
	private EntityManager em;
	
	@PostConstruct
	public void init() {
	}
	
	@Transactional
	public CarDocument create (CarDocument carDocument) {
		em.persist(carDocument);
		return carDocument;
	}
	
	@Transactional
	public CarDocument update (CarDocument carDocument) {
		em.merge(carDocument);
		return carDocument;
	}
	
	@Transactional
	public void delete (CarDocument carDocument) {
		em.remove(carDocument);
	}
	
	public CarDocument findById ( Long id ) {	
		return em.find(CarDocument.class , id);		
	}
}
