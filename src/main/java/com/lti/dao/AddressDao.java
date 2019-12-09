package com.lti.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.lti.entity.Address;
import com.lti.entity.User;

public class AddressDao {
public void add(Address address) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("oracleTest");
	EntityManager em= emf.createEntityManager();
	EntityTransaction tx =em.getTransaction();
	tx.begin();
	em.persist(address);
	tx.commit();
	em.close();
	emf.close();
}
public void addUserwithAddress(User user, int houseno) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("oracleTest");
	EntityManager em= emf.createEntityManager();
	Address address = em.find(Address.class, houseno);
	user.setAddress(address);
	EntityTransaction tx =em.getTransaction();
	tx.begin();
	em.persist(user);
	tx.commit();
	em.close();
	emf.close();
}
}
