package com.rentalx.identity.repository;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.rentalx.identity.User;

@Repository
public class UserRepository {
	
	@PersistenceContext
	private EntityManager em;

	public UserRepository() {
	}
	
	@PostConstruct
	public void init() {
	}
	@Transactional
	public User create(User user) {
		em.persist(user);
		return user;
	}
	
	@Transactional
	public User update(User user) {
		em.merge(user);
		return user;
	}
	
	@Transactional
	public User findById ( Long id ) {
		return em.find(User.class, id);
				
	}
	
	
}