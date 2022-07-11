package com.cdac.app;

import com.cdac.dao.CustomerDao;
import com.cdac.entity.Address;
import com.cdac.entity.Customer;

public class InsertAddress {
	public static void main(String[] args) {
	CustomerDao dao=new CustomerDao();
	/*
	Customer cus=new Customer();
	
	//cus.setCustmId(14);
	cus.setCustmId(101);
	cus.setCustmname("Anuj");
	cus.setEmail("anuj5307@gmail.com");
	dao.add(cus);
	
	
	Address ad=new Address();
	
//	ad.setAddId(120);
	ad.setCity("Kanpur");
	ad.setPincode(825402);
	ad.setState("Jharkhand");
	dao.add(ad);*/
	
	//ad.setAdd(cus);
	//cus.setCustmId(ad);
	//dao.add(cus);*/
	/*Customer cus = dao.fetchCustomer(1);
	Address ad = dao.fetchAddress(1);
	
	cus.setAddress(ad);
	dao.update(cus);*/
	/*Customer cus1 = new Customer();
	  cus1.setCustmId(102);
	cus1.setCustmname("Neha");
	cus1.setEmail("nehapriya@outlook");
	
	Address a = new Address();
	a.setPincode(540283);
	a.setCity("patna");
	a.setState("Bihar");
	dao.add(a);
	cus1.setAddress(a);
	
	dao.add(cus1);*/
}
}