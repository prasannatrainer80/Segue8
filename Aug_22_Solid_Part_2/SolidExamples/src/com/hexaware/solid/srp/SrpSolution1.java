package com.hexaware.solid.srp;

public class SrpSolution1 {

	public static void main(String[] args) {
		Employ e1 = new Employ(1, "Namashivaya", 94923);
		Employ e2 = new Employ(2, "Nivetha", 99424);
		
		EmployDao dao = new EmployDaoImpl();
		System.out.println(dao.addEmployDao(e1));
		System.out.println(dao.addEmployDao(e2));
		
		System.out.println(dao.showEmployDao());
	}
}
