package com.rentalx.Supplier.repository;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.rentalx.account.Supplier;

@Repository
public class SupplierRepository {
	@PersistenceContext
	private EntityManager em;
	
	@PostConstruct
	public void init() {
	}
	
	@Transactional
	public Supplier create (Supplier supplier) {
		em.persist(supplier);
		return supplier;
	}
	
	@Transactional
	public Supplier update (Supplier supplier) {
		em.merge(supplier);
		return supplier;
	}
	
	@Transactional
	public void delete (Supplier supplier) {
		em.remove(supplier);
	}
	
	public Supplier findById ( Long id ) {	
		return em.find(Supplier.class , id);		
	}
}
