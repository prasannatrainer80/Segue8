package com.hexaware.hib;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class ShowInfo {

	public static void main(String[] args) {
		SessionFactory sf = new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(Instructor.class);
		List<Instructor> list = cr.list();
		for (Instructor instructor : list) {
			List<Student> students = instructor.getStudents();
			System.out.println("Instructor Id  " +instructor.getInstructorId());
			System.out.println("Instructor Name  " +instructor.getInstructorName());
			System.out.println("Domain  "+instructor.getDomain());
			for (Student stud : students) {
				System.out.println("Student Name " +stud.getSname());
				System.out.println("Batch Code  " +stud.getBatchCode());
			}
		}
	}
}
