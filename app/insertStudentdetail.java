package com.cdac.app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.cdac.entity.Student;

public class insertStudentdetail {
	 public static void main(String[] args) {
		 
		 EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
	 		EntityManager em = emf.createEntityManager();
	 		EntityTransaction tx = em.getTransaction();
	 		tx.begin();
	 		
	 		Student student=new Student();
	 		student.setStdid(101);
	 		student.setStdname("Neha priya");
	 		student.setSubname("Maths");
	 		student.setNumber(89);
	 		em.persist(student);
	 		tx.commit();
	 		
	 		emf.close();
	 }

}
