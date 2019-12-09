package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.lti.entity.Account;
import com.lti.entity.Transaction;

public class AccountDao {

	public void addAccount(Account account) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("oracleTest");
		EntityManager em=emf.createEntityManager();
		EntityTransaction tx= em.getTransaction();
		tx.begin();
		em.persist(account);
		tx.commit();
		em.close();
		emf.close();
	}
	
	public void addTansactionWithAccount(List<Transaction> transaction, int accno) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("oracleTest");
		EntityManager em=emf.createEntityManager();
		Account account= em.find(Account.class,	accno);
		EntityTransaction tx= em.getTransaction();
		tx.begin();
		for(Transaction t:transaction) {
			t.setAccount(account);
			em.persist(t);
		}
		tx.commit();
		em.close();
		emf.close();
	}
}
