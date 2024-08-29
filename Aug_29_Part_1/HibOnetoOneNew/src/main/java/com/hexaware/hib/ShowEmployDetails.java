package com.hexaware.hib;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class ShowEmployDetails {

	public static void main(String[] args) {
		SessionFactory sf = new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(Employ.class);
		List<Employ> employList = cr.list();
		System.out.println(employList.size());
		for (Employ employ : employList) {
			Company company = employ.getCompany();
			System.out.println("Employ Id " +employ.getEmpId() + " Employ Name " +employ.getName() + 
					" Gender " +employ.getGender() + " Salary " +employ.getSalary() +
					" Department  " +employ.getDept()
						);
			System.out.println("Company Id  " +company.getCompanyId());
			System.out.println("Company Name  " +company.getCompanyName());
			System.out.println("Company Type  " +company.getCompanyType());
			 
		}
//		for (Employ employ : employList) {
//			Company address = employ.getCompany();
//			System.out.println(employ);
//			System.out.println(address);
//		}
	}
}
