package com.hexaware.demo;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class EmployInsertMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SessionFactory sf = new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Employ employ = new Employ();
		System.out.println("Enter Employ Number   ");
		employ.setEmpno(sc.nextInt());
		System.out.println("Enter Employ Name  ");
		employ.setName(sc.next());
		System.out.println("Enter Gender   ");
		employ.setGender(sc.next());
		System.out.println("Enter Department  ");
		employ.setDept(sc.next());
		System.out.println("Enter Designation  ");
		employ.setDesig(sc.next());
		System.out.println("Enter Basic   ");
		employ.setBasic(sc.nextDouble());
		
		Transaction trans = session.beginTransaction();
		session.save(employ);
		trans.commit();
		System.out.println("Record Inserted...");
	}
}
