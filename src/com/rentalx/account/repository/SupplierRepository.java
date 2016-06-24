package com.rentalx.account.repository;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.rentalx.account.Supplier;
import com.rentalx.account.aggregate.Contact;

@Repository
public class SupplierRepository {
	
		
		@PersistenceContext
		private EntityManager em;
		
		public SupplierRepository() {
		}
		
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
		
		
		public Supplier findById ( Long id ) {	
			return em.find(Supplier.class , id);		
		}
		
}
