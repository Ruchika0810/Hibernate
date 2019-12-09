package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.lti.entity.Customer;
import com.lti.entity.Employee;

public class EmployeeDao {
public void add(Employee emp) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("oracleTest");
	EntityManager em = emf.createEntityManager();
	EntityTransaction tx =em.getTransaction();
	tx.begin();
	em.persist(emp);
	tx.commit();
	em.close();
	emf.close();
}
public Employee fetch(int empId) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("oracleTest");
	EntityManager em = emf.createEntityManager();
	Employee emp = (Employee) em.find(Employee.class, empId);
	em.close();
	emf.close();
	return emp;
}
public List<Employee> fetchAll(){
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("oracleTest");
	EntityManager em =emf.createEntityManager();
	//JPQL
	Query q = em.createQuery("select e from Employee e");
	List<Employee> list = q.getResultList();
	
	em.close();
	emf.close();
	return list;
}
}
