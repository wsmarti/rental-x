package com.rentalx.account.repository;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.rentalx.account.aggregate.Contact;

@Repository
public class ContactInfRepository {
	
	@PersistenceContext
	private EntityManager em;
	
	public ContactInfRepository() {
	}
	
	@PostConstruct
	public void init() {
	}
	
	@Transactional
	public Contact create (Contact contato) {
		em.persist(contato);
		return contato;
	}
	
	@Transactional
	public Contact update (Contact contato) {
		em.merge(contato);
		return contato;
	}
	
	
	public Contact findById ( Long id ) {	
		return em.find( Contact.class , id);		
	}
	

}
