package com.hexaware.onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class AddDetailsMain {

	public static void main(String[] args) {
		SessionFactory sf = new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Transaction trans = session.beginTransaction();
		
		Student s1 = new Student();
		s1.setName("Jahnavi");
		s1.setEmail("jahnavi@gmail.com");
		Passport p1 = new Passport();
		p1.setAddress1("TRT 81");
		p1.setAddress2("8th Avenue");
		p1.setState("TS");
		p1.setCountry("INDIA");
		s1.setPassport(p1);
		p1.setStudent(s1);
		session.save(s1);
		trans.commit();
		System.out.println("Created...");
	}
}
