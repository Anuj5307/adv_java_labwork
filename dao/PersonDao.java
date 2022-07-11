package com.cdac.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.cdac.entity.Person;

public class PersonDao {
	  
	  public void add(Person person) {
		  EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
			EntityManager em = emf.createEntityManager();
			EntityTransaction tx = em.getTransaction();
			tx.begin();

			em.persist(person); //persist method will generate insert query
			
			tx.commit();
			emf.close();
	  }
	  public Person fetchPersonByPassportNo(int passportNo) {
		  
		  EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
			EntityManager em = emf.createEntityManager();
			EntityTransaction tx = em.getTransaction();
			tx.begin();

			Query q=em.createQuery("select p from Person p join p.passport ps where ps.passportNo=:psno");
		  q.setParameter("psno", passportNo);
		Person person=(Person)q.getSingleResult();
			//System.out.println(person.getPersName()+" "+person.getEmail()+" "+person.getDateOfBirth()+""+person.getPassport());
			tx.commit();
			emf.close();
		  return person;
	  }
	  
	  public List<Person> fetchPersonsByPassportExpiryYear(int year){
		  
		  EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
			EntityManager em = emf.createEntityManager();
			EntityTransaction tx = em.getTransaction();
			tx.begin();

			Query q=em.createQuery("select p from Person p join p.passport ps where year(ps.expiryDate)=:yea");
		  q.setParameter("yea", year);
		List<Person>list=q.getResultList();
			//System.out.println(person.getPersName()+" "+person.getEmail()+" "+person.getDateOfBirth()+""+person.getPassport());
			tx.commit();
			emf.close();
		  return list;
	  }
	  
	  public void delete(Class clazz, Object pk) {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
	
				EntityManager em = emf.createEntityManager();
				EntityTransaction tx = em.getTransaction();
				tx.begin();

				//find method generates select query where pk = ?
				Object obj = em.find(clazz, pk);
				em.remove(obj); //remove will generate delete query
				
				tx.commit();
	
				emf.close();
			}

}
