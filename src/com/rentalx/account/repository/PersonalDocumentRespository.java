package com.rentalx.account.repository;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.rentalx.account.PersonalDocument;

@Repository
public class PersonalDocumentRespository {
	
	@PersistenceContext
	private EntityManager em;
	
	@PostConstruct
	public void init() {
	}
	
	@Transactional
	public PersonalDocument create (PersonalDocument personalDocument) {
		em.persist(personalDocument);
		return personalDocument;
	}
	
	@Transactional
	public PersonalDocument update (PersonalDocument personalDocument) {
		em.merge(personalDocument);
		return personalDocument;
	}
	
	@Transactional
	public void delete (PersonalDocument personalDocument) {
		em.remove(personalDocument);
	}
	
	public PersonalDocument findById ( Long id ) {	
		return em.find(PersonalDocument.class , id);		
	}
}
