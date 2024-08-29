package com.hexaware.hib;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class AddDetails {

	public static void main(String[] args) {
		SessionFactory sf = new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Transaction trans = session.beginTransaction();
		Instructor ins = new Instructor();
		ins.setInstructorName("Prasanna");
		ins.setDomain("Java");
		
		Student s1 = new Student();
		s1.setSname("Balaji");
		s1.setBatchCode("Batch2");
		
		Student s2 = new Student();
		s2.setSname("Stuti");
		s2.setBatchCode("Batch2");
		
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(s1);
		studentList.add(s2);
		
		ins.setStudents(studentList);
		
		session.save(ins);
		trans.commit();
		
		System.out.println("Data Saved...");
	}
}
