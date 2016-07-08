package com.rentalx.vehicle.repository;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.rentalx.vehicle.Maintenance;

@Repository
public class MaintenanceRepository {
	@PersistenceContext
	private EntityManager em;
	
	@PostConstruct
	public void init() {
	}
	
	@Transactional
	public Maintenance create (Maintenance maintenance) {
		em.persist(maintenance);
		return maintenance;
	}
	
	@Transactional
	public Maintenance update (Maintenance maintenance) {
		em.merge(maintenance);
		return maintenance;
	}
	
	@Transactional
	public void delete (Maintenance maintenance) {
		em.remove(maintenance);
	}
	
	public Maintenance findById ( Long id ) {	
		return em.find(Maintenance.class , id);		
	}
}
