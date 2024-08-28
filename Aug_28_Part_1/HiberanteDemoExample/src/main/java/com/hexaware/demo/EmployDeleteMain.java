package com.hexaware.demo;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class EmployDeleteMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int empno;
		System.out.println("Enter Employ No   ");
		empno = sc.nextInt();
		SessionFactory sf = new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Query query = session.createQuery("from Employ where empno = "+empno);
		List<Employ> employList = query.list();
		if (employList.size()==1) {
			Transaction trans = session.beginTransaction();
			session.delete(employList.get(0));
			trans.commit();
			System.out.println("*** Record Deleted ***");
		} else {
			System.out.println("*** Record Not Found ***");
		}
	}
}
