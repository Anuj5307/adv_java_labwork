package com.cdac.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.cdac.entity.Address;
import com.cdac.entity.Customer;


public class CustomerDao {
	public void add(Customer cust) {//inserting the Customer details in database 
    	//During this step, the persistence.xml file will be read
 		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
 		EntityManager em = emf.createEntityManager();
 		EntityTransaction tx = em.getTransaction();
 		tx.begin();
 		
 		em.persist(cust); //persist method will generate insert query
        tx.commit();
 		
 		emf.close();
}

	public void add(Address add) {//inserting the Customer address  in database 
    	//During this step, the persistence.xml file will be read
 		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
 		EntityManager em = emf.createEntityManager();
 		EntityTransaction tx = em.getTransaction();
 		tx.begin();
 		
 		em.persist(add); //persist method will generate insert query
        tx.commit();
 		
 		emf.close();
}
   public void update(Customer cust) {
	   EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		em.persist(cust); //persist method will generate insert query
       tx.commit();
		
		emf.close();
	   
   }

   public Customer fetchCustomer(int id) {
	// TODO Auto-generated method stub
	   EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();

		//find method generates select query where pk = ?
		Customer emp = em.find(Customer.class, id);
		
		emf.close();

		return emp;	
	}
   public List<Customer> fetchCustomersByEmail(String domain) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();

		Query q = em.createQuery("select c from Customer c where c.email like :em");
		q.setParameter("em", "%" + domain + "%");
		List<Customer> list = q.getResultList();
		
		emf.close();

		return list;
	}


} 

