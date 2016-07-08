package com.rentalx.account.repository;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.rentalx.account.Account;

@Repository
public class AccountRepository {
	@PersistenceContext
	private EntityManager em;
	
	@PostConstruct
	public void init() {
	}
	
	@Transactional
	public Account create (Account account) {
		em.persist(account);
		return account;
	}
	
	@Transactional
	public Account update (Account account) {
		em.merge(account);
		return account;
	}
	
	@Transactional
	public void delete (Account account) {
		em.remove(account);
	}
	
	public Account findById ( Long id ) {	
		return em.find(Account.class , id);		
	}
}
