package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.lti.entity.Customer;

public class CustomerDao {

	public void add(Customer customer) {
		
		//Step1 : Create/Obtain EntityManagerFactory Object
		//During this step, META-INF/persistence.xml file will be read
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("oracleTest");
		
		//Step2 : Create/Obtain EntityManager Object
		//This step is logically similar to opening Connection in JDBC code
		EntityManager em =emf.createEntityManager();
		
		//Step3 : Start/Participate in a Transaction
		//DML operations cannot be performed without a transaction 
		EntityTransaction tx =em.getTransaction();
		tx.begin();
		
		//Now we can insert /update/delete/select whatever we want
		em.persist(customer); //persist method generates insert query
		
		tx.commit();
		
		em.close();
		emf.close();
	}
	public Customer display(int customerId) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("oracleTest");
		EntityManager em =emf.createEntityManager();
		
		//find method generates select query where pk=?
		Customer cust= (Customer) em.find(Customer.class, customerId);
		
		em.close();
		emf.close();
		
		return cust;
	}
	public List<Customer> fetchAll(){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("oracleTest");
		EntityManager em =emf.createEntityManager();
		//JPQL
		Query q = em.createQuery("select c from Customer c");
		List<Customer> list = q.getResultList();
		
		em.close();
		emf.close();
		return list;
	}
public void update(Customer customer) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("oracleTest");
		EntityManager em =emf.createEntityManager();
		
		EntityTransaction tx =em.getTransaction();
		tx.begin();
		
		em.merge(customer); //merge method generates update query
		
		tx.commit();
		
		em.close();
		emf.close();
	}
}
