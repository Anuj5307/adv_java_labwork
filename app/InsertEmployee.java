package com.cdac.app;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.cdac.dao.EmployeeDao;
import com.cdac.entity.Employee;


public class InsertEmployee {
	
	public static void main(String[] args) {
		
		/*Employee emp = new Employee();
 		emp.setEmpno(1003);
 		emp.setEmpname("Neha");
 		emp.setSalary(60000);
 		emp.setDateOfJoining(LocalDate.of(2017, 9, 12));
 		
 		EmployeeDao dao=new EmployeeDao();
 		dao.add(emp);*/
		
	/*	EmployeeDao dao=new EmployeeDao();
		Employee emp=dao.fetch(1001);
		System.out.println(emp.getEmpname()+" "+emp.getSalary()+" "+emp.getDateOfJoining());*/
		
		/*EmployeeDao dao = new EmployeeDao();
		List<Employee> list = dao.fetchAll();
		for(Employee emp : list)
			System.out.println(emp.getEmpno() + " " + emp.getEmpname() + " " + emp.getSalary() + " " + emp.getDateOfJoining());*/
		
		/*EmployeeDao dao = new EmployeeDao();
		List<Employee> list2 = dao.fetchAllBySalary(15000);
        for(Employee emp:list2)
        	System.out.println(emp.getEmpno() + " " + emp.getEmpname() + " " + emp.getDateOfJoining());*/
		
		System.out.println("..............");
		EmployeeDao dao = new EmployeeDao();
		List<String> names = dao.fetchAllNames();
		for(String name : names)
			System.out.println(name);
		
		System.out.println("..............");
		List<Object[]> namesAndSalaries = dao.fetchAllNamesAndSalaries();
		for(Object[] arr : namesAndSalaries)
			System.out.println(arr[0] + " " + arr[1]);
		
    		
	
    /* public static void main(String[] args) {
    	//During this step, the persistence.xml file will be read
 		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
 		EntityManager em = emf.createEntityManager();
 		EntityTransaction tx = em.getTransaction();
 		tx.begin();
 		
 		Employee emp = new Employee();
 		emp.setEmpno(1001);
 		emp.setEmpname("Anuj");
 		emp.setSalary(15000);
 		emp.setDateOfJoining(LocalDate.of(2018, 9, 12));
 		em.persist(emp); //persist method will generate insert query
 		
 		tx.commit();
 		
 		emf.close();*/
     }
}
