package com.jsp.dao;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.dto.Employee;

public class EmployeeDao {
	public Employee saveEmployee(Employee employee) {
		
		EntityManagerFactory  entityManagerFactory=Persistence.createEntityManagerFactory("god");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		if(employee!=null) {
			entityTransaction.begin();
			entityManager.persist(employee);
			entityTransaction.commit();
		}
		return employee;
		
	}
	
	public Employee updateEmployee(Employee employee) {
		int id=employee.getId();
		EntityManagerFactory  entityManagerFactory=Persistence.createEntityManagerFactory("god");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Employee employee2= entityManager.find(Employee.class, id);
		if(employee2!=null) {
			entityTransaction.begin();
			entityManager.merge(employee);
			entityTransaction.commit();
		}
		return employee2;
	}
	
	public Employee deleteEmployee(Employee employee) {
		int id=employee.getId();
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("god");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Employee employee2= entityManager.find(Employee.class, id);
		if(employee2!=null) {
			entityTransaction.begin();
			entityManager.remove(employee2);
			entityTransaction.commit();
		}
		return employee2;
	}

}
