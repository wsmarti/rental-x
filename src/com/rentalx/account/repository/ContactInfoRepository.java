package com.rentalx.account.repository;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.rentalx.account.ContactInfo;

@Repository
public class ContactInfoRepository {
	@PersistenceContext
	private EntityManager em;
	
	@PostConstruct
	public void init() {
	}
	
	@Transactional
	public ContactInfo create (ContactInfo contactInfo) {
		em.persist(contactInfo);
		return contactInfo;
	}
	
	@Transactional
	public ContactInfo update (ContactInfo contactInfo) {
		em.merge(contactInfo);
		return contactInfo;
	}
	
	@Transactional
	public void delete (ContactInfo contactInfo) {
		em.remove(contactInfo);
	}
	
	public ContactInfo findById ( Long id ) {	
		return em.find( ContactInfo.class , id);		
	}
}
