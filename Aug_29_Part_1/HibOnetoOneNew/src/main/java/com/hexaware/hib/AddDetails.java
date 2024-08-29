package com.hexaware.hib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class AddDetails {

	public static void main(String[] args) {
		SessionFactory sf = new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = sf.openSession();
		
		Transaction trans = session.beginTransaction();
		Employ employ = new Employ();
		employ.setName("sabari");
		employ.setGender("MALE");
		employ.setDept("Java");
		employ.setSalary(99422);
		
		Company company = new Company();
		company.setCompanyName("Hexaware");
		company.setCompanyType("Software");
		company.setCity("Chennai");
		company.setState("TN");
		employ.setCompany(company);
		company.setEmploy(employ);
		
		session.save(employ);
		trans.commit();
		System.out.println("Data Saved...");
		
	}
}
